/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowsetexample;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
/**
 *
 * @author Ahsan
 */
public class catchedroesetexample {
    public static void main(String[] args) {
        try(CachedRowSet row = RowSetProvider.newFactory().createCachedRowSet()){
            row.setUrl("jdbc:mysql://localhost:3306/bookstoredb");
            row.setUsername("root");
            row.setPassword("Udayan2019");
            row.setCommand("SELECT name, title from book JOIN users ON user_id = Users_user_id where user_id = 2;");
            row.execute();
            
            while(row.next()){
                String name = row.getString("name");
                String title = row.getString("title");
                
                System.out.printf("%-15s %s\n", name, title);
            }
            
        }catch(Exception er){
        
        }
    }
}
