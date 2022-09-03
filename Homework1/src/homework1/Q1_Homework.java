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
public class Q1_Homework {
    public void percentage(){
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Enter the first course's mark");
        float firstCourse = myScan.nextFloat();
        
        System.out.println("Enter the second course's mark");
        float secondCourse = myScan.nextFloat();
        
        System.out.println("Enter the third course's mark");
        float thirdCourse = myScan.nextFloat();
        
        System.out.println("Enter the fourth course's mark");
        float fourthCourse = myScan.nextFloat();
        
        float additionOfMarks = firstCourse + secondCourse 
                + thirdCourse + fourthCourse;
        
        float subtotal = additionOfMarks / 4;
        
        System.out.println(subtotal + "%");
    }
}
