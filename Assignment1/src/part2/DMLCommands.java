/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

/**
 *
 * @author Ahsana
 */
public class DMLCommands {
    
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
        
            Scanner myScan = new Scanner(System.in);
            
            int itemId = 115;
            
            String itemCategoryId = "APP";
            
            String description =  "Chicken momos";
            
            int price = 12;
            
            Boolean isVegetarian = false;
            
            String cmd = "insert into menuitem values( " + itemId + ", '" + itemCategoryId + "', '" + description + "', " + price + ", " + isVegetarian + " )";
            System.out.println("Executing this command " + cmd);
            
            Statement st = con.createStatement();
            st.executeUpdate(cmd);
            System.out.println("Menu item added successfully");
            st.close();
    
}
    }
}
