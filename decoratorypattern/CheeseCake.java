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
public class CheeseCake extends Dessert{
    public CheeseCake(){
        description="Cheese Cake ";
    }
    @Override
    public double cost() {
        return 10;
    }
    
}
