/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.MenuItemCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class MenuCategoryAccessor {
    
    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;
    
    private MenuCategoryAccessor(){}
    
    private static void init() throws ClassNotFoundException, SQLException{
    if(conn == null){
        Class.forName(ConnectionParameters.DRIVERCLASS);
        conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
        
        selectAllStatement = conn.prepareStatement("SELECT * FROM MENUITEMCATEGORY");
        
    }
        
    }
    
    public static List<MenuItemCategory> getAllCategory() throws ClassNotFoundException, SQLException{
    
    List<MenuItemCategory> cats = new ArrayList();
    
    try{
    init();
    ResultSet rs = selectAllStatement.executeQuery();
    while(rs.next()){
        String cat = rs.getString("ITEMCATEGORYID");
        String desc = rs.getString("ITEMCATEGORYDESCRIPTION");
        MenuItemCategory tempcat = new MenuItemCategory(cat, desc);
        cats.add(tempcat);
        
    }
    
    }catch(SQLException ex){
    cats = new ArrayList();
    }
        return cats;
    }
}
