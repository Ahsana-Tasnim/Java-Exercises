/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsana
 */
public class Student {
    private int id;
    private String faculty;
    private double gpa;

    @Override
    public String toString() {
        String res = "";
        
        res += "ID = " + id;
        res += " FACULTY = " +faculty;
        res += " GPA = " + gpa;
        
        return res;
    }

    public Student(int id, String faculty, double gpa) {
        this.id = id;
        this.faculty = faculty;
        this.gpa = gpa;
    }
}
