/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework9;

/**
 *
 * @author Ahsana
 */
public class Homework9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject square = new Square(5.5);
        System.out.println("The Perimeter of Square is " + square.getPerimeter());
        System.out.println("The Area of Square is " + square.calcArea());
        
        GeometricObject triangle = new Triangle(10.7);
        System.out.println("The Perimeter of Triangle is " + triangle.getPerimeter());
        System.out.println("The Area of Triangle is " + triangle.calcArea());
    }
    
}
