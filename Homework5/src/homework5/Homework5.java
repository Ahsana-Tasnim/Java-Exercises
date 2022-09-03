/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;
import cputils.FileUtils;
/**
 *
 * @author Ahsana
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //part 1
        String[] data = FileUtils.readIntoArray("airports.csv");
        AirportMethods[] airports = new AirportMethods[data.length];
        
        for (int i = 0; i < data.length; i++) {
            String line = data[i];
            
            String[] pieces = line.split(":");
            AirportMethods temp = new AirportMethods(pieces[0], pieces[1], pieces[2]);
            
            airports[i] = temp;
        }
        //Looping through all airports and printing them
        for(AirportMethods a: airports){
            System.out.println(a);
        }
        
        //part 2
        
        System.out.println("*****************************");
              
        int count = 0;
        for(AirportMethods a: airports){
            if(a.getCountry().equals("United States of America")){
                System.out.println(a.getCode());
                count++;
            }
        }
        System.out.println("There are " + count + " airports in United States of America.");
        
    }
    
}
