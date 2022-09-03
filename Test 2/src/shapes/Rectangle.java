/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Ahsana
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String colour, double length, double width) {
        super("Rectangle", colour);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String format() {
        return super.format() + ", length = " + length + ", width = " + width + ", Area = " + calArea();
    }

    @Override
    public double calArea() {
        return length * width;
    }
    
}
