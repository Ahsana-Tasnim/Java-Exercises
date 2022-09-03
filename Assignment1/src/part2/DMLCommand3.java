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
public class DMLCommand3 {
    
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
        
            Scanner myScan = new Scanner(System.in);
            
            int itemId = 115;
            
            String description =  "Cheese momos";
            
            int price = 10;
            
            Boolean isVegetarian = true;
            
            PreparedStatement ps = con.prepareStatement("update menuitem set description = ?, price = ?, vegetarian = ? where itemId = ?");
            ps.setString(1, description);
            ps.setInt(2, price);
            ps.setBoolean(3, isVegetarian);
            ps.setInt(4, itemId);
            
            ps.executeUpdate();
            
            System.out.println("Database updated sucessfully");
            
            ps.close();
        }
    }
    
}
