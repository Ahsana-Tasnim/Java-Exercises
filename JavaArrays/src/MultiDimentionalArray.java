/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class MultiDimentionalArray {
    public void multiArrays(){
//    int apartments[][] = new int [2][3];
//    
//    apartments[0][0] = 101;
//    apartments[0][1] = 102;
//    apartments[0][2] = 103;
//    apartments[1][0] = 104;
//    apartments[1][1] = 105;
//    apartments[1][2] = 106;
//    
//        System.out.println(apartments[0][1]);

      int apartments[][] = {{101,200,102}, {102,222,222},{303,404,475},{409,909,76}};
      
        for (int i = 0; i < apartments.length; i++) {
            for (int j = 0; j < apartments[i].length; j++) {
                System.out.print(apartments[i][j]);
                System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
    
}
