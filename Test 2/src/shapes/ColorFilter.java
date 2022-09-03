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
public class ColorFilter implements ShapeFilter{
    private String color;

    public ColorFilter(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public boolean accept(Shape sh) {
        if(color.equals(sh.getColour())){
            return true;
        }else{
            return false;
        }
        
//        return sh.getColour().equals(color);
        
    }
    
}
