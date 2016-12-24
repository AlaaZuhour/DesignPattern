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
public class CommandPattern {

    
    public static void main(String[] args) {
        Computer c=new Computer();
        WebBrowser web=new WebBrowser();
        BrowseWebPage b=new BrowseWebPage(web);//create command and send the reciver to it
        c.setCommand(b);
        c.enterWasPressed();
        
    }
    
}
