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
public class WeddingParty {
    Light light;
    Sterio sterio;
    Guest guest;
    FoodCookcor cook;
    WeddingHall hall;
    public WeddingParty(Light l,Sterio s,Guest g,FoodCookcor c, WeddingHall hall){
        this.light=l;
        this.cook=c;   this.guest=g; this.sterio=s;
        guest.invite();  this.hall=hall;  
        
        
    }
    public void startParty(){
        hall.open();
        hall.getL().on();
        hall.getS().playMusic();
        cook.on();
        cook.prepare();
    }
    public void endParty(){
         hall.getL().off();
        hall.getS().stopMusic();
        cook.off();
        hall.clean();
        hall.close();
    }
}
