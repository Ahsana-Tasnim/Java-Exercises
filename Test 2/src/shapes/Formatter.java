/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Ahsana
 */
//use interface tyoe as a reference type
//use interface type as a return type
//use interface class a method argument
public class Formatter {
    private Formattable[] items;

    public Formatter(Formattable[] items) {
        this.items = items;
    }
    
    public String[] formatAll(){
        String[] res = new String[items.length];
        Formattable temp;
        
        for (int i = 0; i < items.length; i++) {
            temp = items[i];
            res[i] = temp.format();
        }
        
        return res;
    }
    
    public Formattable[] getItem(){
        return items;
    }
}
