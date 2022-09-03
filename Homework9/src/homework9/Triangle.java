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
public class Triangle extends GeometricObject{
    private double length;
    private double perimeter;
    private double area;
    
    public Triangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    
    @Override
    public double calcArea() {
       area = (length * length) / 2;
       
       return area;
    }
    
    @Override
    public double getPerimeter(){
        perimeter = 3 * length;
        
        return super.getPerimeter() + perimeter;
    }
    
}
