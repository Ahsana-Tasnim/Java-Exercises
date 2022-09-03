/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.MenuItemCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MenuCategoryAccessor {
    
    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;
    
    private MenuCategoryAccessor(){} 
    
    
    private static void init() throws ClassNotFoundException, SQLException{
    if(conn == null){
      Class.forName(ConnectionParameters.DRIVERCLASS);
      conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
      selectAllStatement = conn.prepareStatement("SELECT * from MENUITEMCATEGORY");
    
    }
    
    }
    
    public static List<MenuItemCategory> getAllCategories() throws ClassNotFoundException, SQLException{
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
