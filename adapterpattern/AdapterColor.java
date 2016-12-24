/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author alazh
 */
public class AdapterColor implements SubtractiveColor{
    AdditiveColor color;
    
    public AdapterColor(AdditiveColor color){
        this.color=color;
    }
    @Override
    public void setColor(int c, int m, int y) {
        color.setColor(255-c, 255-m, 255-y);
    }

    @Override
    public int[] getColor() {
      return color.getColor();
    }

    @Override
    public String display() {
        return null;
    }

    
    
    
}
