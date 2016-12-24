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
public abstract class KFC {
    public Meal orderMeal(int type){
       Meal meal=creatMeal(type);
       meal.prapare();
       return meal;
    }
    public abstract Meal creatMeal(int type);
}
