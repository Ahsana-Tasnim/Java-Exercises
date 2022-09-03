/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tommy
 */
public class ConnectionManager {
    
    private static Connection conn = null;
    
    static Connection getConnection(String url, String user, String password) throws SQLException{
        if(conn == null){
            conn = DriverManager.getConnection(url, user, password);
        }
        
        return conn;
    }
    
}
