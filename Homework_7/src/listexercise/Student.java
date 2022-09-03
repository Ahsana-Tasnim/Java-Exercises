package listexercise;

public class Student {

    private int id;
    private String faculty;
    private double gpa;

    public Student(int id, String fac, double av) {
        this.id = id;   
        faculty = fac;  
        this.gpa = av;  
    }
    
    
    public double getGpa() {
        return gpa;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getId() {
        return id;
    }
    
    public static boolean isValidFaculty(Student student) {   
        return (student.faculty.equals("Business") || student.faculty.equals("Engineering") || student.faculty.equals("Health Science") || student.faculty.equals("Information Technology"));    
    }
    
    public static boolean isValidGpa (Student student) {
        return (student.gpa >= 0 && student.gpa <= 4);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        return hash;
    }
    
   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String res = "";

        res += "ID = " + id;
        res += ", Faculty = " + faculty;
        res += ", GPA = " + gpa;

        return res;
    }

    
} // end class Student
