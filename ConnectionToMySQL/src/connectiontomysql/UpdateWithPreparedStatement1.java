/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontomysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 *
 * @author Ahsan
 */
public class UpdateWithPreparedStatement1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "Udayan2019")){
        
            Scanner myScan = new Scanner(System.in);
            
            System.out.println("Enter name         : ");
            String name = myScan.nextLine();
            
            System.out.println("Enter user_id         : ");
            int user_id = myScan.nextInt();
            
            PreparedStatement ps = con.prepareStatement("update users set name = ? where user_id = ?");
            ps.setString(1, name);
            ps.setInt(2, user_id);
            
            int count = ps.executeUpdate();
            if(count == 1)
                System.out.println("Database updated sucessfully");
            else
                System.out.println("Sorry id not found");

            ps.close();
//        con.close();
        }
    }
    
}
