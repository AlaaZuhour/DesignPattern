/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singltonpattern;

/**
 *
 * @author alazh
 */
public class SingltonPattern {

    
    public static void main(String[] args) {
       Book b=Book.getInstance();
       b.rent();
     //  b.rent();
    }
    
}
