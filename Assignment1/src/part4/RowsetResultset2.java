/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Ahsana
 */
public class RowsetResultset2 {
    
    public static void main(String[] args) {
        try(CachedRowSet row = RowSetProvider.newFactory().createCachedRowSet()){
            row.setUrl("jdbc:mysql://localhost:3306/restaurantdb");
            row.setUsername("root");
            row.setPassword("Udayan2019");
            row.setCommand("SELECT itemCategoryDescription, MenuItemCategory.itemCategoryID, description, price from MenuItemCategory JOIN MenuItem ON MenuItemCategory.itemCategoryID = MenuItem.itemCategoryID where itemID = 102;");
            row.execute();
            
            while(row.next()){
                String itemCategoryDescription = row.getString("itemCategoryDescription");
                String itemCategoryID = row.getString("itemCategoryID");
                String description = row.getString("description");
                double price = row.getDouble("price");
                
                System.out.printf("%-15s %-20s %-20s %-20s\n", itemCategoryDescription, itemCategoryID, description, price);
            }
            
        }catch(Exception er){
            System.out.println(er.getMessage());
        }
    }
    
}
