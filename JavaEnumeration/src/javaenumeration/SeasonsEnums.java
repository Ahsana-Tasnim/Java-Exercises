/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaenumeration;

/**
 *
 * @author Ahsan
 */
public class SeasonsEnums {
    enum Season{
        WINTER(5),
        SPRING(10),
        SUMMER(15){
            public String getDetails(){
                return "Don't wear warm clothes";
            }
        },
        FALL(20);
        
        private int value;
        
        private Season(int value){
            this.value = value;
        }
        
        public String getDetails(){
            return "Wear warm clothes";
        }
    }
    
    public static void main(String[] args){
        System.out.println(Season.FALL);
        System.out.println(Season.SUMMER.value);
        System.out.println(Season.WINTER.ordinal());
        System.out.println(Season.FALL.ordinal());
        
        for(Season s: Season.values()){
            System.out.println(s + " " + s.value + " " + s.getDetails());
        }
    }
}
