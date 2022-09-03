/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ahsana
 */
public class JavaArrayListMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> listA = new ArrayList<>();
        listA.add(7);
        listA.add("Hello");
        listA.add(true);
        
        System.out.println("Here are the elements of listA");
        for(Object o : listA){
//            System.out.println(o);
        }
        System.out.println(listA.get(0));
        System.out.println("");
        
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(17);
        nums.add(54);
        nums.add(76);
        nums.add(34);
        nums.add(54);
        nums.add(78);
        nums.add(17);
        nums.add(45);
        
        System.out.println("Here are the elements of nums");
        
        for(int i=0; i< nums.size(); i++){
            int myNum = nums.get(i);
            System.out.println(myNum);
        }
        System.out.println("");
        
        //Some useful methods besides "add"
        
        System.out.println("nums.size gives you the size of yor arraylist" + 
                nums.size());
        
        System.out.println("nums.contain is used to check whether a particular "
                + "elment is in your arrayliast" + nums.contains(17));
        int key = 17;
        System.out.println("how many times " + key + "is in my Arraylist" + Collections.frequency(nums,key));
        System.out.println("at what index is the first occurence of a [articular number " + nums.indexOf(76));
        System.out.println("At which position is the last occurence of the key " + nums.lastIndexOf(key));
        System.out.println("Getting the value of any index" + nums.get(2));
        System.out.println("Biggest elemnt in the arraylist " + Collections.max(nums));
        
        //Some methods that can change the list
        nums.set(0, 44);
        System.out.println("After using set method the arraylist looks like this " + nums.get(0));
        
        nums.remove(0);
        System.out.println("After using remove out arraylist looks like this " + nums);
       
        Collections.shuffle(nums);
        System.out.println("After using shuffle our arraylist looks like " + nums);
        
        Collections.reverse(nums);
        System.out.println("After using reverse our arraylist is " + nums);
        
        Collections.sort(nums);
        System.out.println("after using sort methid our arraylist " + nums);
        
        nums.clear();
        System.out.println("after using clear method the arraylist looks like" + nums);
        
        System.out.println("is my arraylist empty " + nums.isEmpty());
        
        System.out.println("how many times is in my Arraylist" + Collections.frequency(listA, "Hello"));
        
    }
    
}
