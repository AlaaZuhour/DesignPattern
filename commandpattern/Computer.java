/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author alazh
 */
public class Computer {
    Command com;
    
    public Computer(){}
    
    public void setCommand(Command com){
        this.com=com;
    }
    public void enterWasPressed(){
        com.browse();
    }
}
