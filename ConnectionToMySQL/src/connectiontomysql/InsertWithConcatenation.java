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
import java.sql.Statement;
/**
 *
 * @author Ahsan
 */
public class InsertWithConcatenation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "Udayan2019")){
        
            Scanner myScan = new Scanner(System.in);
            
            System.out.println("Enter name         : ");
            String name = myScan.nextLine();
            
            System.out.println("Enter email         : ");
            String email = myScan.nextLine();
            
            System.out.println("Enter user_id         : ");
            int user_id = myScan.nextInt();
            
            String cmd = "insert into users values( " + user_id + ", '" + name + "', '" + email + "' )";
            System.out.println("Executing this command " + cmd);
            
            Statement st = con.createStatement();
            st.executeUpdate(cmd);
            System.out.println("Added user successfully");
            st.close();
//        con.close();
        }
    }
    
}
