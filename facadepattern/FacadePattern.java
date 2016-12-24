/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

/**
 *
 * @author alazh
 */
public class FacadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Light l =new Light();
       Sterio s=new Sterio();
       FoodCookcor c=new FoodCookcor();
       Guest g=new Guest();
       WeddingHall h=new WeddingHall(l,s);
       WeddingParty p=new WeddingParty(l,s,g,c,h);
       p.startParty();
       p.endParty();
    }
    
}
