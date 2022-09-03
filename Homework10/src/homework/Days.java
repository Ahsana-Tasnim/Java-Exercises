/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Ahsana
 */
public class Days {
    enum DaysOfTheWeek{
        Saturday{
            public String getHours(){
                return "12 - 6";
            }
        },
        Sunday{
            public String getHours(){
                return "10 - 5";
            }
        },
        Monday,
        Tuesday,
        Wednesday,
        Thursday;
        
        public String getHours(){
                return "7 - 7";
            }
    }
    
    public static void main(String[] args) {
        for(DaysOfTheWeek days: DaysOfTheWeek.values()){
            System.out.println("Opening hour for " + days + " is " + days.getHours() + "\n");
        }
    }
}
