/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author alazh
 */
public class SwimmingSport implements SwimmingBehavior{

    @Override
    public void swim() {
        System.out.print("I am swimming but not for a long time");
    }
    
}
