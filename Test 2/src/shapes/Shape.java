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
public abstract class Shape implements Formattable{
    private String type;
    private String colour;

    public abstract double calArea();
    
    public Shape(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    @Override
    public String format() {
        return "Type = " + type + ", Colour = " + colour;
    }
    
    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    
}
