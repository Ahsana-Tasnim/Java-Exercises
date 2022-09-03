/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentList;

/**
 *
 * @author Ahsana
 */
public class StudentMethods {
    private int id;
    private String faculty;
    private double gpa;

    @Override
    public String toString() {
        String res = "";
        
        res += "ID = " + id + ", ";
        res += " FACULTY = " +faculty + ", ";
        res += " GPA = " + gpa;
        
        return res;
    }

    public StudentMethods(int id, String faculty, double gpa) {
        this.id = id;
        this.faculty = faculty;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentMethods other = (StudentMethods) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getGpa() {
        return gpa;
    }

    
}
