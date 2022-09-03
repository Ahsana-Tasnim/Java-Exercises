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
public class ArrayOutBound {
    public static void main(String[] args) {
        
        try{
            int[] num = new int[5];
            num[10] = 50;
        
        }catch(ArrayIndexOutOfBoundsException aoob){
            System.out.println(aoob);
        }
        
        System.out.println("This code will execute");
    }
}
