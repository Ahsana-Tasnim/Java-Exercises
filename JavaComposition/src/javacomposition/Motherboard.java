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
public class Motherboard {
    private String model;
    private String manufacturer;
    private String ramSlots;
    private String cardSlots;

    public Motherboard(String model, String manufacturer, String ramSlots, String cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }
    
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is loading");
    }
}
