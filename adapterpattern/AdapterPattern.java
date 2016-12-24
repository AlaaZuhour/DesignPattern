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
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cyan = 255,magnta = 0,yellow = 0;
       AdditiveColor color=new RGB();
       SubtractiveColor col=new CMY();
       AdapterColor adapter=new AdapterColor(color);
       col.setColor(cyan, magnta, yellow);
       adapter.setColor(cyan, magnta, yellow);
       System.out.print("the values "+col.display()+" can be represented by: "+color.display());
    }
    
}
