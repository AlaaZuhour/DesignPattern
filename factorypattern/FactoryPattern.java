/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import java.util.Scanner;

/**
 *
 * @author alazh
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       KFC kfc=new RammalahKFC();
       Scanner input =new Scanner(System.in);
       System.out.println("please enter your meal type: 1 for wings Meal 2 for individual Meal");
       int str=input.nextInt();
       kfc.orderMeal(str);
       kfc=new NablusKFC();
        System.out.println("please enter your meal type: 1 for wings Meal 2 for individual Meal");
        str=input.nextInt();
       kfc.orderMeal(str);
    }
    
}
