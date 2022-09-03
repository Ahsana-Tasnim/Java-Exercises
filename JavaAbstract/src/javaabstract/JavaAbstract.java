/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstract;

/**
 *
 * @author Ahsana
 */
public class JavaAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog doberman = new Dog();
        doberman.communicate();
        doberman.move();
        
        Animal sparrow = new Bird();
        sparrow.move(); //polimorphism
        
        Animal labredor = new Dog();
        labredor.move();
        labredor.weirdFeaute();
        labredor.communicate();
    }
    
}
