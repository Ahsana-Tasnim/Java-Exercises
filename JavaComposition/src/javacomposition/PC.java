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
public class PC {
    private Case myCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case myCase, Monitor monitor, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

}
