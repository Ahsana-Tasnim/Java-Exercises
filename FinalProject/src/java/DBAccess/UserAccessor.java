package DBAccess;

import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;

    private UserAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("select * from user");

        }
    }

    public static List<User> getAllUsers() throws ClassNotFoundException, SQLException {
        List<User> users = new ArrayList();

        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int userId = rs.getInt("userId");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String city = rs.getString("city");
                String country = rs.getString("country");
                User user = new User(userId, name, email, password, city, country);
                users.add(user);
            }
        } catch (SQLException ex) {

            users = new ArrayList();
        }
        return users;
    }

}
