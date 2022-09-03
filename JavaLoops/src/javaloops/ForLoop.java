/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

/**
 *
 * @author Ahsan
 */
public class ForLoop {
    public void MyForLoop(){
        System.out.println("***");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        
        int min = 1;
        int max = 100;
        
        System.out.println("*****");
        
        for (int i = min; i <= max; i++) {
            if(i % 15 == 0){
                System.out.println("Fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
