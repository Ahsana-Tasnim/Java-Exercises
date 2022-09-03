/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.MenuItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Tommy
 */
public class MenuItemAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectAllStatement =null;
    private static PreparedStatement deleteStatement = null;
    private static PreparedStatement insertStatement = null;
    private static PreparedStatement updateStatement = null;

    private MenuItemAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * FROM MENUITEM");
            deleteStatement = conn.prepareStatement("delete from MENUITEM where ITEMID = ? ");
            
            insertStatement = conn.prepareStatement("insert into MENUITEM values(?,?,?,?,?)");
            
            updateStatement = conn.prepareStatement("update MENUITEM set ITEMCATEGORYID = ? , DESCRIPTION = ?, PRICE = ?, VEGETARIAN = ? where ITEMID = ?");
            
        }
    }

    public static List<MenuItem> getAllMenuItems() throws ClassNotFoundException, SQLException {
        List<MenuItem> items = new ArrayList();
        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ITEMID");
                String category = rs.getString("ITEMCATEGORYID");
                String description = rs.getString("DESCRIPTION");
                double price = rs.getDouble("PRICE");
                boolean vegetarian = rs.getBoolean("VEGETARIAN");

                MenuItem item = new MenuItem(id, category, description, price, vegetarian);
                items.add(item);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            items = new ArrayList();
        }
        return items;
    }
    
    public static boolean deleteItem(MenuItem item) throws ClassNotFoundException, SQLException {
    boolean res;
    try{
    init();
    deleteStatement.setInt(1, item.getId());
    
    int rowCount = deleteStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
      res = false;
    
    }
    return res;
    }
    
    public static boolean deleteItemById(int id) throws ClassNotFoundException, SQLException{
    MenuItem dummy = new MenuItem(id, "dummycategory", "dummyDescription", 0.0, false);
    return deleteItem(dummy);
    
    }
    
    public static boolean insertItem(MenuItem item) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    
    insertStatement.setInt(1, item.getId());
    insertStatement.setString(2, item.getCategory());
    insertStatement.setString(3, item.getDescription());
    insertStatement.setDouble(4, item.getPrice());
    insertStatement.setBoolean(5, item.isVegetarian());
    
    int rowCount = insertStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
    
     res = false;
    }
    return  res;
    }
    
    public static boolean updateItem(MenuItem item) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    updateStatement.setString(1, item.getCategory());
    updateStatement.setString(2, item.getDescription());
    updateStatement.setDouble(3, item.getPrice());
    updateStatement.setBoolean(4, item.isVegetarian());
    updateStatement.setInt(5, item.getId());
    
    int rowCount = updateStatement.executeUpdate();
    res = (rowCount ==1);
    
    
    }catch(SQLException ex){
       res = false;
    
    }
    return res;
    
    } 
    
}
