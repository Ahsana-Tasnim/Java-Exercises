/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

/**
 *
 * @author Ahsana
 */
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Employee("Ahsana", "Tasnim", "Dieppe,Moncton", "atasnim01@mynbcc.ca", 1234, "IT", 30000.56);
        
        System.out.println(p.display());
    }
    
}
