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
public class HelloString {
    
    public void stringInput(){
    Scanner myScan = new Scanner(System.in);
    System.out.println("Enter your name");
    
    String str = myScan.nextLine();
    
    System.out.println(str);
  }
}
