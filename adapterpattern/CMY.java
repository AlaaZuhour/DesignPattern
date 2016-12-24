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
public class CMY implements SubtractiveColor{
    int cyan, magnta,yellow;
    @Override
    public void setColor(int c, int m, int y) {
       this.cyan=c;
       this.magnta=m;
       this.yellow=y;
    }

    @Override
    public int[] getColor() {
      return new int[]{this.cyan,this.magnta,this.yellow};  
    }

    @Override
    public String display() {
       return "cyan= "+cyan+" magnta= "+magnta+" yellow= "+yellow;
    }
    
}
