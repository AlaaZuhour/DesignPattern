/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;

import java.util.Observable;
import java.util.Observer;
public class Banker extends Observable {
private int number;
public Banker(){
    
}
   public void numberChanged(){
       setChanged();
        notifyObservers(); //pull mode
   }
   public void setNumber(int n){
       this.number=n;
       numberChanged();
   }
   public int getNumber(){
       return this.number;
   }
}
