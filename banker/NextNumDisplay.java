/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;

import java.util.Observable;
import java.util.Observer;
public class NextNumDisplay implements Observer{
    Observable obs;
    int number;
   
    public NextNumDisplay(Observable observable) {    
      this.obs = observable;      
      observable.addObserver(this); 
      
    }
    @Override
    public void update(Observable o, Object arg) {
        Banker b=(Banker)o;
        this.number = b.getNumber();
        
        display();
    }

    private void display() {
       
       System.out.println("the next turn is for agent number: "+this.number);
         
    }

   
    
}
