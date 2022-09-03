/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.BatchUpdateException;


/**
 *
 * @author Ahsana
 */
public class BatchExecution {
    
    public static void main(String[] args) throws SQLException{
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "Udayan2019")){
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        
        try{
        //st.addBatch("insert into MenuItemCategory values ('DRI', 'Drinks');");
        
        st.addBatch("insert into MenuItem values(401,'DRI','Sprite',7,true);");
        st.addBatch("insert into MenuItem values(402,'DRI','Pepsi',9,true);");
        st.addBatch("insert into MenuItem values(403,'DRI','Water',5,true);");
        st.addBatch("insert into MenuItem values(404,'DRI','Crush',10,true);");
        int[] er = st.executeBatch();
        con.commit();       
        
        }catch(BatchUpdateException er){
            System.out.println("Error in batch : " + er.getMessage());
            con.rollback();
        }
        
        }
    }
    
}
