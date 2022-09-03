/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ahsana
 */
public class ConnectingToSQL {
    
    public static void main(String[] args) throws SQLException {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019");
        
        System.out.println("Connection to restaurantdb is successful");
        System.out.println(con.getClass());
        con.close();
    }
}
