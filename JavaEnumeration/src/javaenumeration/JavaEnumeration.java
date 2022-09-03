/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaenumeration;

/**
 *
 * @author Ahsan
 */
public class JavaEnumeration {

    enum Lights{
        GREEN,
        RED,
        YELLOW
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lights trafficLights = Lights.GREEN;
        
        switch(trafficLights){
            case GREEN:
                   System.out.println("Pass");
                   break;
            case YELLOW:
                   System.out.println("Wait");
                   break;
            case RED:
                   System.out.println("Stop");
                   break;       
                  
        }
    }
    
}
