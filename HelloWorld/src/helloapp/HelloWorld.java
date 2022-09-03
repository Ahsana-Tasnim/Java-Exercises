/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapp;

/**
 *
 * @author Ahsana
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello World\t");
        
        int num1 = 9;
        
        System.out.println("Ahsana Tasnim");
        
        
//        For non-static
        HelloAddition myAddition = new HelloAddition();
        myAddition.addition();

//        For static
//          HelloAddition.addition();
    

        HelloString myString = new HelloString();
        myString.stringInput();
        
        HelloDatatype myData = new HelloDatatype();
        myData.checkData();
    }
}
