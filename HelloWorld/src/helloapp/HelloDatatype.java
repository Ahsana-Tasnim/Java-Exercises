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
public class HelloDatatype {
    
    public void checkData(){
        
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please provide input");
        boolean myBool = myScan.hasNextFloat();
        
        System.out.println(myBool);
    }
}
