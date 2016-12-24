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
public interface AdditiveColor {
    public void setColor(int r,int g,int b);
    public int[] getColor();
    public String display();
}
