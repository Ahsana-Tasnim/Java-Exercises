/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

/**
 *
 * @author Ahsana
 */
//we use single generic method declaration and we can use it with argument
// of diffrenet tyoes. To create a generic method we use diamond notation <T> before the return type.

public class GenericMethods {
    
//    public void displayArray(Integer[] s){
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
//    }
//    
//    public void displayArray(Float[] s){
//        for (int i = 0; i < s.length; i++) {  //method overloading
//            System.out.println(s[i]);
//        }
//    }
    
    public <T> void displayArray(T[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
    public static void main(String[] args) {
        GenericMethods obj = new GenericMethods();
        Integer[] numbers = {7, 17, 44};
        Float[] floatingNum = {12.1f, 22.2f, 13.3f};
        String[] courseName = {"Java", "C#", "Python", "PHP"};
        obj.displayArray(numbers);
        obj.displayArray(floatingNum);
        obj.displayArray(courseName);
    }
}
