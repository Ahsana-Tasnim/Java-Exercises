/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

/**
 *
 * @author Ahsana
 */
public class DMLCommand2 {
    
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
        
            Scanner myScan = new Scanner(System.in);
            
            int itemId = 311;
            
            String itemCategoryId = "DES";
            
            String description =  "Chocolate Brownie";
            
            int price = 13;
            
            Boolean isVegetarian = true;
            
            PreparedStatement ps = con.prepareStatement("insert into menuitem values(?,?,?,?,?)");
            ps.setInt(1, itemId);
            ps.setString(2, itemCategoryId);
            ps.setString(3, description);
            ps.setInt(4, price);
            ps.setBoolean(5, isVegetarian);
            
            ps.executeUpdate();
            System.out.println("Added dessert successfully");
            ps.close();
        }
    }
    
}
