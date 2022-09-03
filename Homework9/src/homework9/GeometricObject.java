/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework9;

/**
 *
 * @author Ahsana
 */
public abstract class GeometricObject implements Icalcuable{
    double perimeter;
    @Override
    public double getPerimeter(){
        return perimeter;
        
    }
    
    public abstract double calcArea();
    
}
