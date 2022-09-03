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
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String colour, double base, double height) {
        super("Triangle", colour);
        this.base = base;
        this.height = height;
    }

    public String format() {
        return super.format() + ", base = " + base + ", height = " + height + ", Area = " + calArea();
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calArea() {
        return 0.5 * base * height;
    }
}
