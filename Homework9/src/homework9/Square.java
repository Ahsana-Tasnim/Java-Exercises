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
public class Square extends GeometricObject{
    private double length;
    private double perimeter;
    private double area;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }
    
    @Override
    public double calcArea() {
        area = length * length;
        
        return area;
    }
    
    @Override
    public double getPerimeter(){
        perimeter = length + length;
        
        return super.getPerimeter() + perimeter;
    }
    
    
}
