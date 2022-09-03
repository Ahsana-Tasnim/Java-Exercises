package db;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class CustomerAccessor {
    
    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;
    private static PreparedStatement deleteStatement = null;
    private static PreparedStatement insertStatement = null;
    private static PreparedStatement updateStatement = null;

    private CustomerAccessor() {}

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * FROM Customer");
            deleteStatement = conn.prepareStatement("delete from Customer where id = ? ");
            
            insertStatement = conn.prepareStatement("insert into Customer values(?,?,?,?)");
            
            updateStatement = conn.prepareStatement("update Customer set customerName = ? , gender = ?, age = ? where id = ?");
            
        }
    }

    public static List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
        List<Customer> customers = new ArrayList();
        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("customerName");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");

                Customer customer = new Customer(id, name, gender, age);
                customers.add(customer);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            customers = new ArrayList();
        }
        return customers;
    }
    
    public static boolean deleteCustomer(Customer customer) throws ClassNotFoundException, SQLException {
    boolean res;
    try{
    init();
    deleteStatement.setInt(1, customer.getId());
    
    int rowCount = deleteStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
      res = false;
    
    }
    return res;
    }
    
    public static boolean deleteCustomerById(int id) throws ClassNotFoundException, SQLException{
    Customer dummy = new Customer(id, "dummy", "F/M", 0);
    return deleteCustomer(dummy);
    
    }
    
    public static boolean insertCustomer(Customer customer) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    
    insertStatement.setInt(1, customer.getId());
    insertStatement.setString(2, customer.getName());
    insertStatement.setString(3, customer.getGender());
    insertStatement.setInt(4, customer.getAge());
    
    int rowCount = insertStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
    
     res = false;
    }
    return  res;
    }
    
    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    updateStatement.setString(1, customer.getName());
    updateStatement.setString(2, customer.getGender());
    updateStatement.setInt(3, customer.getAge());
    updateStatement.setInt(4, customer.getId());
    
    int rowCount = updateStatement.executeUpdate();
    res = (rowCount ==1);
    
    
    }catch(SQLException ex){
       res = false;
    
    }
    return res;
    
    } 
    
    
}
