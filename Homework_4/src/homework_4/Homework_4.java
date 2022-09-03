/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ahsan
 */
public class Homework_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);
        numbers.add(55);
        
        //1.get method
        System.out.println("The value of index 5 in the Arraylist is " + numbers.get(5));
        
        //2.reverse method
        Collections.reverse(numbers);
        System.out.println("The reversed Arraylist is " + numbers);
        
        //3.shuffle method
        Collections.shuffle(numbers);
        System.out.println("The shuffled list is " + numbers);
        
        //4.remove method
        numbers.remove(7);
        System.out.println("After removing the 7th member of the arraylist it looks like: " + numbers);
        
        //5.max method
        System.out.println("Biggest number in the arraylist is: " + Collections.max(numbers));
        
        //6. contains method
        System.out.println("Checking if the array list contains 39: " + numbers.contains(39));
        
        //7.clear method
        numbers.clear();
        System.out.println("Clearing all the elements: " + numbers);
        
    }
    
}
