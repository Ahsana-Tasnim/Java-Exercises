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
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution basicResolution;

    public Monitor(String model, String manufacturer, int size, Resolution basicResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.basicResolution = basicResolution;
    }
    
    public void createPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getBasicResolution() {
        return basicResolution;
    }

}
