/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateexceptiondemo;

import cputils.FileUtilsExceptionsThrown;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

/**
 *
 * @author Ahsana
 */
public class DateExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lines = null;

        List<SimpleDate> dates = new ArrayList<>();
        String fileName = "errFile.txt";
        List<String> errorList = new ArrayList<>();
        //Read data from file
        //Create date object for valid data
        //Display erroe message for invalid data

        try {
            lines = FileUtilsExceptionsThrown.readIntoArray("dates.csv");

            for (String s : lines) {
                String[] pieces = s.split(",");

                try {
                    SimpleDate sd = new SimpleDate(Integer.parseInt(pieces[0]), Integer.parseInt(pieces[1]), Integer.parseInt(pieces[2]));

                    dates.add(sd);
                } catch (DateException dex) {
//                    System.out.println("Error " + s);
                    
                    errorList.add(s);
                    FileUtilsExceptionsThrown.writeListToFile(errorList, fileName);
                    System.err.format(s + "\n");
                }
            }
            for (SimpleDate temp : dates) {
                System.out.println(temp.toString());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Can't find the file. Please provide the right file.");
        }
    }

}
