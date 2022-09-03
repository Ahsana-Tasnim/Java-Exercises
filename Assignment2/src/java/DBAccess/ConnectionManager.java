package DBAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    
    private static Connection conn = null;
    
    static Connection getConnection(String url, String user, String password) throws SQLException{
        if(conn == null){
            conn = DriverManager.getConnection(url, user, password);
        }
        
        return conn;
    }
    
}
