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
public class WeddingHall {
    Light l;
    Sterio s;
    public WeddingHall(Light l,Sterio s){
        this.l=l;
        this.s=s;
    }
    public Light getL() {
        return l;
    }

    public void setL(Light l) {
        this.l = l;
    }

    public Sterio getS() {
        return s;
    }

    public void setS(Sterio s) {
        this.s = s;
    }
    
    public void open(){
        System.out.println("the party started");
    }
    public void close(){
        System.out.println("the party ended");
    }
    public void clean(){
        
    }
}
