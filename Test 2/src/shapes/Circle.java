/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Ahsan
 */
public class Circle extends Shape{
    private double radius;
    double pi = Math.PI;

    public Circle(String colour, double radius) {
        super("Circle", colour);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    @Override
    public String format() {
        String res = super.format();
//        res += ", Radius = " + radius + ", Area = " + calArea();
        return res;
    }   

    @Override
    public double calArea() {
        double area = pi * Math.pow(radius, 2);
        return BigDecimal.valueOf(area).setScale(3, RoundingMode.HALF_DOWN).doubleValue();
    }
    
}
