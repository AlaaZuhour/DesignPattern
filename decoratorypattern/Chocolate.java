/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorypattern;

/**
 *
 * @author alazh
 */
public class Chocolate extends ToppingDecorator{
    Dessert dessert;
    public Chocolate(Dessert d){
        this.dessert=d;
       
    }
    @Override
    public String getDescription() {
        return dessert.getDescription()+", Chocolate ";
    }

    @Override
    public double cost() {
        return dessert.cost()+0.5;
    }
    
}
