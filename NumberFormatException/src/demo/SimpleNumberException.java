/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Ahsana
 */
public class SimpleNumberException {
    
    public static void main(String[] args) {
        
        try{
            String str = "hello";
            int num1 = Integer.parseInt(str);
            System.out.println(num1);
        
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        
        System.out.println("This code will execute");
    }
}
