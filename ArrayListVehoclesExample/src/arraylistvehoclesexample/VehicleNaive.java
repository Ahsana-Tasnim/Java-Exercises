/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvehoclesexample;

/**
 *
 * @author Ahsan
 */
public class VehicleNaive {
    private int id;
    private int year;
    private String make;
    private String model;
    int price;
    
    public VehicleNaive(int id, int year, String make, String model, int price){
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Simple Vehichle( " + "id= " + id
                + ", year= " + year + ", make= " + make + ", model= "
                + model + " price= " + price;
    }
    
}
