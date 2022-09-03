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
public class GenericClass <T> {
    private T first;
    private T second;

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public GenericClass(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public void swapName(){
        T temp;
        temp = first;
        first = second;
        second = temp;
    }
    
    public static void main(String[] args) {
        GenericClass<String> Name = new GenericClass<>("Ahsana", "Tasnim");
        
        //before swap
        
        System.out.println("Output before calling swap method: FirstName " + Name.getFirst() + " Last Name " + Name.getSecond());
        
        //after swap
        Name.swapName();
        System.out.println("Output after calling swap method: FirstName: " + Name.getFirst() + " LastName: " + Name.getSecond());
    }
}
