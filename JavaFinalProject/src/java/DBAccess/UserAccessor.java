package DBAccess;

import Entity.User;
import Entity.UserLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectStatement = null;
    private static PreparedStatement insertStatement = null;

    private UserAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectStatement = conn.prepareStatement("select * from user where name = ? and password = ?");
            insertStatement = conn.prepareStatement("insert into user values (?,?,?,?,?,?)");
        }
    }

    public static boolean getUsers(UserLogin user) throws ClassNotFoundException, SQLException {
        boolean res = false;
    try {
            init();
            
            selectStatement.setString(1, user.getName());
            selectStatement.setString(2, user.getPassword());
            ResultSet rs = selectStatement.executeQuery();
            
            if(rs.next()){
                res = true;
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return res;
    }
    
    public static boolean insertUser(User user) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    
    insertStatement.setInt(1, user.getUserId());
    insertStatement.setString(2, user.getName());
    insertStatement.setString(3, user.getEmail());
    insertStatement.setString(4, user.getPassword());
    insertStatement.setString(5, user.getCity());
    insertStatement.setString(6, user.getCountry());
    
    int rowCount = insertStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
    
     res = false;
    }
    return  res;
    }

}
