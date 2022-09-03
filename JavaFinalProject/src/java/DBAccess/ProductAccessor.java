package DBAccess;

import Entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ProductAccessor {
    
    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;
    private static PreparedStatement deleteStatement = null;
    private static PreparedStatement insertStatement = null;
    private static PreparedStatement updateStatement = null;
    private static PreparedStatement selectOneStatement = null;
    
    
    private ProductAccessor(){}
    
    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * FROM product");
            deleteStatement = conn.prepareStatement("delete from product where productId = ? ");
            updateStatement = conn.prepareStatement("update product set name = ?, category = ?, price = ?, quantity = ?, available = ? where productId = ?");
            insertStatement = conn.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
            selectOneStatement = conn.prepareStatement("Select * from product where productId = ?");
        }
    }
    
    public static List<Product> getAllProducts() throws ClassNotFoundException, SQLException {
        List<Product> products = new ArrayList();
        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt("productId");
                int userId = rs.getInt("userId");
                String name = rs.getString("name");
                String category = rs.getString("category");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String available = rs.getString("available");

                Product product = new Product(productId, userId, name, category, price, quantity, available);
                products.add(product);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            products = new ArrayList();
        }
        return products;
    }
    
    public static boolean deleteProduct(Product product) throws ClassNotFoundException, SQLException {
    boolean res;
    try{
    init();
    deleteStatement.setInt(1, product.getProductId());
    
    int rowCount = deleteStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
      res = false;
    
    }
    return res;
    }
    
    public static boolean deleteProductById(int id) throws ClassNotFoundException, SQLException{
    Product dummy = new Product(id, 0, "dummy", "dum cat", 0.0, 0, "dum");
    return deleteProduct(dummy);
    }
    
    public static boolean insertProduct(Product product) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    
    insertStatement.setInt(1, product.getProductId());
    insertStatement.setInt(2, product.getUserId());
    insertStatement.setString(3, product.getName());
    insertStatement.setString(4, product.getCategory());
    insertStatement.setDouble(5, product.getPrice());
    insertStatement.setInt(6, product.getQuantity());
    insertStatement.setString(7, product.getAvailable());
    
    int rowCount = insertStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
    
     res = false;
    }
    return  res;
    }
    
    public static Product viewOneProduct(Product product) throws ClassNotFoundException, SQLException{
    
    try{
    init();
    
    selectOneStatement.setInt(1, product.getProductId());
    
            
    ResultSet rs = selectOneStatement.executeQuery();
     while (rs.next()) {
                int productId = rs.getInt("productId");
                int userId = rs.getInt("userId");
                String name = rs.getString("name");
                String category = rs.getString("category");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String available = rs.getString("available");

                product = new Product(productId, userId, name, category, price, quantity, available);
     }
    }catch(SQLException ex){
     product = null;
    }
    return  product;
    }
    
    public static Product viewOneProductById(int id) throws ClassNotFoundException, SQLException{
    Product dummy = new Product(id, 0, "dummy", "dummy cat", 0.0, 0, "dum");
    return viewOneProduct(dummy);
    }
    
    public static boolean updateProduct(Product product) throws ClassNotFoundException, SQLException{
    boolean res;
    
    try{
    init();
    
    updateStatement.setString(1, product.getName());
    updateStatement.setString(2, product.getCategory());
    updateStatement.setDouble(3, product.getPrice());
    updateStatement.setInt(4, product.getQuantity());
    updateStatement.setString(5, product.getAvailable());
    updateStatement.setInt(6, product.getProductId());
    
    int rowCount = updateStatement.executeUpdate();
    res = (rowCount == 1);
    
    }catch(SQLException ex){
     res = false;
    }
    return  res;
    }
    
    public static boolean updateProductById(Product product) throws ClassNotFoundException, SQLException{
    return updateProduct(product);
    }
}
