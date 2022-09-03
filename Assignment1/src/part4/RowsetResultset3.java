package part4;
import java.sql.SQLException;
import java.util.Scanner;
import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.Predicate;

/**
 *
 * @author Ahsana
 */

class PricePredicate implements Predicate{
    private double price;

    public PricePredicate(double price) {
        this.price = price;
    }
    
    public boolean evaluate(RowSet rs){
        try{
            return rs.getDouble("price") > this.price;
        }catch(Exception er){
            return false;
        }
    }

    @Override
    public boolean evaluate(Object o, int i) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean evaluate(Object o, String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class RowsetResultset3 {
    
    public static void main(String[] args) {
        try(FilteredRowSet fs = RowSetProvider.newFactory().createFilteredRowSet()){
        fs.setUrl("jdbc:mysql://localhost:3306/restaurantdb");
        fs.setUsername("root");
        fs.setPassword("Udayan2019");
        fs.setCommand("SELECT * FROM menuitem where vegetarian = 1 and price > 20;");
        fs.execute();
        
            
        while(fs.next()){
            String itemID = fs.getString("itemID");
            String itemCategoryID = fs.getString("itemCategoryID");
            String description = fs.getString("description");
            double price = fs.getDouble("price");
            boolean isVegetarian = fs.getBoolean("vegetarian");

                System.out.printf("%-10s %-10s %-50s %-10s %-10s\n", itemID, itemCategoryID, description, price, isVegetarian);
            }
        
        }catch(Exception er){
            System.out.println(er.getMessage());
        }
    }
    
}
