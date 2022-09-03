/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvehoclesexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Ahsan
 */
public class ArrayListVehoclesExample {

    /**
     * @param args the command line arguments
     */
    // no-arg constructor
    //parameterized constructor
    public static void main(String[] args) {
        // TODO code application logic here
        VehicleNaive v1 = new VehicleNaive(101, 2017, "Dodge", "caraven", 300000);
        
        VehicleNaive v2 = new VehicleNaive(101, 2017, "Dodge", "caraven", 300000);
        
        System.out.println(v1);
        
        VehicleNaive v3 = v1;
        System.out.println(v3);
        
        // using Equals Method
        // if you don't override "equals" , then saying "a.equals(b)" is the same as saying "a==b"
        //This means that no two objects in different memory locations are equal.
        
        System.out.println("Is v1 and v2 equal " + v1.equals(v2));
        System.out.println("Is v1 and v3 equal " + v1.equals(v3));
        
        VehicleProper v4 = new VehicleProper(101, 2017, "Dodge", "Caravan", 300000);
        VehicleProper v5 = new VehicleProper(102, 2018, "Dodge", "Random", 400000);
        
        System.out.println(v4);
        System.out.println(v5);
        
        System.out.println("Are these two vehicles equal " + v4.equals(v5));
        
        ArrayList<VehicleProper> vehicles = new ArrayList<>();
        vehicles.add(new VehicleProper(101, 2017, "Dodge", "Caravan", 8000));
        vehicles.add(new VehicleProper(102, 2018, "Dodge", "Caravan", 9000));
        vehicles.add(new VehicleProper(103, 2019, "Dodge", "Caravan", 11000));
        vehicles.add(new VehicleProper(104, 2020, "Dodge", "Caravan", 77000));
        vehicles.add(new VehicleProper(105, 2021, "Dodge", "Caravan", 40000));
        vehicles.add(new VehicleProper(106, 2022, "Dodge", "Caravan", 5000));
        vehicles.add(new VehicleProper(109, 2016, "Dodge", "Caravan", 300000));
       
        System.out.println("****Vehocles*****");
        for (VehicleProper v: vehicles) {
            System.out.println(v);
        }
        
        VehicleProper tempA = new VehicleProper(107, 2017, "Dodge", "Caravan", 300000);
        System.out.println("Does this list contains 'tempA' " + vehicles.contains(tempA));
        
        System.out.println("Frequency of tempA " + Collections.frequency(vehicles, tempA));
        
        VehicleProper tempB = new VehicleProper(111, 2017, "Dodge", "Ram", 300000);
        System.out.println("Does the List contains tempB " + vehicles.contains(tempB));
        
        System.out.println("Let's use collection.shuffle() " );
        Collections.shuffle(vehicles);
        for(VehicleProper v: vehicles){
            System.out.println(v);
        }
        
        System.out.println("Let's call collection.sort() ");
        Collections.sort(vehicles);
        for(VehicleProper v: vehicles){
            System.out.println(v);
        }
    }
    
}
