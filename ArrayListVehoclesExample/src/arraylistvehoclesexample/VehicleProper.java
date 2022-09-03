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
public class VehicleProper implements Comparable<VehicleProper>{
    private int id;
    private int year;
    private String make;
    private String model;
    int price;

    public VehicleProper(int id, int year, String make, String model, int price) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VehicleProper{" + "id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleProper other = (VehicleProper) obj;
        return this.id == other.id;
    }
    
    @Override
    public int compareTo(VehicleProper o){
        int res;
        //v1.compareTo(v2)
            //this = v1
            //o = v2
        if(this.year == o.year){
            res = 0;
        }
        else if(this.year < o.year){
            res = -1;
        }
        else{
            res = 1;
        }
        return res;
    }
    
}
