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
public class Waffle extends Dessert{
    public Waffle(){
        description="Waffle ";
    }
    @Override
    public double cost() {
        return 9.5;
    }
    
}
