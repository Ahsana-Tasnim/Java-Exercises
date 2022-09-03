/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomposition;

/**
 *
 * @author Ahsana
 */
public class JavaComposition {

    //Each class is a component of another class
    //IN composition there is a "has a relationship" between classes
    //Example --> A car has a door, A car has tyres, A car
    //for components of pc are motherboard, case, monitor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 200, 7);
        Case myCase = new Case("2270", "Hp", "240w", dimensions);
        
        Monitor theMonitor = new Monitor("25 inch hp", "Acer", 23, new Resolution(15, 15));
        
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", "4", "4");
        
        PC thePC = new PC(myCase, theMonitor, theMotherboard);
        
        thePC.getMonitor().createPixelAt(7, 17, "Purple");
        
        thePC.getMyCase().pressPwerButton();
        
        thePC.getMotherboard().loadProgram("Windows XP");
        
        System.out.println(thePC.getMonitor().getModel());
    }
    
}
