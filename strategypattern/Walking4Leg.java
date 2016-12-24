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
public class Walking4Leg implements WalkingBehavior{

    @Override
    public void walk() {
         System.out.print("I am walking on 4 legs");
    }
    
}
