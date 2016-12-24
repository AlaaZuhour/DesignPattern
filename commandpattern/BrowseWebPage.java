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
public class BrowseWebPage implements Command{
    WebBrowser browse;
    
    public BrowseWebPage(WebBrowser bro){
        this.browse=bro;
    }
    @Override
    public void browse() {
        browse.requstWebPage();
        browse.viewWebPage();
    }
    
}
