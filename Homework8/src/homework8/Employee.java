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
public class Employee extends Person{
    
    private int employeeID;
    private String department;
    private double salary;

    public Employee(String firstName, String lastName, String address, String email, int employeeID, String department, double salary) {
        super(firstName, lastName, address, email);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String display(){
    String res = super.display();
    
    res += ", Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary;
    
    return res;
    }
    
    
}
