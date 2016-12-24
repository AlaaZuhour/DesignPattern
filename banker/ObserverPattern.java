/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;


public class ObserverPattern {
    public static void main(String[] args){
        int n=1;
        Banker b=new Banker();
        NextNumDisplay a=new NextNumDisplay(b);
        CurrentNumDisplay e=new CurrentNumDisplay(b);
        b.setNumber(n);
      //  b.setNumber(0);
       // b.setNumber(1);
    }
}
