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
public class DecoratoryPattern {

   
    public static void main(String[] args) {
        Dessert d=new CheeseCake();
        d=new Chocolate(d);
        System.out.println("the order is "+d.getDescription()+""+d.cost());
    }
    
}
