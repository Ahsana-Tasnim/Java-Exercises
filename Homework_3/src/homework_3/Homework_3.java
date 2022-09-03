/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_3;
import java.util.Scanner;

/**
 *
 * @author Ahsana
 */
public class Homework_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        
        int num0 = 0;
        
        System.out.println("Enter the number: ");
        int num1 = myScan.nextInt();
        
        int num2 = num0 + num1;
        
        int count = 20;
        
        System.out.print(num0 + " " + num1 + " " + num2);
        
        int num3 = num1 + num2;
        
        for (int i = num3; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
        
    }
    
}
