/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author alazh
 */
public class NablusKFC extends KFC{

    @Override
    public Meal creatMeal(int t) {
        if(t==1)
            return new NablusWingsMeal();
        else if(t==2)
        return new NablusIndividualMeal();
        
        return new NoMeal();
    }
    
}
