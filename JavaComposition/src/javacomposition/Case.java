/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomposition;

/**
 *
 * @author Ahsan
 */
public class Case {
    private String model;
    private String manufacturer;
    private String pSupply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, String pSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.pSupply = pSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getpSupply() {
        return pSupply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }
    
    public void pressPwerButton(){
        System.out.println("This power button is pressed");
    }
}
