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
public class RGB implements AdditiveColor{
    int red, green , blue;
    @Override
    public void setColor(int r, int g, int b) {
        this.red=r;
        this.green=g;
        this.blue=b;
    }

    @Override
    public int[] getColor() {
      return new int[]{this.red,this.green,this.blue};  
    }

    @Override
    public String display() {
        return "red= "+red+" green= "+green+" blue= "+blue;
    }
    
}
