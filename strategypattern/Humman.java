/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author alazh
 */
public class Humman extends Mummels{
    
    public Humman() {
        super("Humman");
        walk=new Walk2Feet();
    }
    
    
}
