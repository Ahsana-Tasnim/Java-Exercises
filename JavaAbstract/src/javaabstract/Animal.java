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
public abstract class Animal {
    
    public abstract void communicate();
    
    public abstract void move();
    
    public void weirdFeaute(){
        System.out.println("This is a weired feature");
    }
}

//Abstract class can have regular methods 
//but regular class cannot contain abstract method
//You can implement abstract methods in the parent class
//A child class has to implement all the abstarct mehtods of parent class