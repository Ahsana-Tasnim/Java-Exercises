/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import java.util.ArrayList;

/**
 *
 * @author Ahsana
 */
public class JavaGenerics {

    /**
     * @param args the command line arguments
     */
    //we use generics in java for type safety and to restrict a user to add 
    //perticular type of objects
    //Generics in java protects from compilation erorrs
    //we denote generics using a diamond notation
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        
        numbers.add(14);
        numbers.add(22);
        numbers.add(7);
        numbers.add(17);
        numbers.add(34);
        numbers.add(55);
        
        printNumbers(numbers);
    }

    private static void printNumbers(ArrayList<Integer> n) {
        for(int i : n){
            System.out.println((Integer)i*2);
        }
    }
        
}
