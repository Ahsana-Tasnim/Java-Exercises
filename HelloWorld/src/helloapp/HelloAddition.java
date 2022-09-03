/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapp;
import java.util.Scanner;

/**
 *
 * @author Ahsan
 */
public class HelloAddition {
    
    public void addition(){
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Enter first number");
        float num1 = myScan.nextFloat();
        
        System.out.println("Enter second number");
        float num2 = myScan.nextFloat();
        
        float sum = num1 + num2;
        
        System.out.println(sum);
        
    }
}
