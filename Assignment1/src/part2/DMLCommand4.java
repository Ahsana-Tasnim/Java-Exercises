/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author Ahsana
 */
public class DMLCommand4 {
    
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
            
            int itemId = 107;
            
            PreparedStatement ps = con.prepareStatement("Delete from menuitem where itemId = ?");
            ps.setInt(1, itemId);
            
            ps.executeUpdate();
            
            System.out.println("Item deleted sucessfully");

            ps.close();
//        con.close();
        }
    }
    
}
