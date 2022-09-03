/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Ahsana
 */
public class RowsetResultset1 {
    
    public static void main(String[] args) throws SQLException{
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select itemID, itemCategoryID, description, price FROM menuitem;");
            
            while(rs.next()){
            String itemID = rs.getString("itemID");
            String itemCategoryID = rs.getString("itemCategoryID");
            String description = rs.getString("description");
            float price = rs.getFloat("price");

                System.out.printf("%-10s %-10s %-55s %10f\n", itemID, itemCategoryID, description, price);
            }
        }
        
    }
    
}
