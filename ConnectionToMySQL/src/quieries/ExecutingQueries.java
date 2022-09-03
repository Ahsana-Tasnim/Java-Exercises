/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quieries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ExecutingQueries {
    public static void main(String[] args) throws SQLException{
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "Udayan2019")){
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select title, description, price FROM book ORDER BY price DESC;");
            
            while(rs.next()){
            String title = rs.getString("title");
            String description = rs.getString("description");
            float price = rs.getFloat("price");
            
//                System.out.println(title + " " + description + " " + price);

                System.out.printf("%-20s %-88s %1.1f\n", title, description, price);
            }
        }
        
    }
}
