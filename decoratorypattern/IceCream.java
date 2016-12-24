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
public class IceCream extends ToppingDecorator{
    Dessert dessert;
    
    public IceCream(Dessert d){
        this.dessert=d;
    }
    @Override
    public String getDescription() {
        return dessert.getDescription()+", Ice Cream";
    }

    @Override
    public double cost() {
       return dessert.cost()+1.0;
    }
    
}
