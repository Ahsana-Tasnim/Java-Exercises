/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;

/**
 *
 * @author Ahsana
 */
public class Q2_Homework {
    public void checkIntegerType(){
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        boolean isInteger = myScan.hasNextInt();
        
        System.out.println(isInteger);
    }
}
