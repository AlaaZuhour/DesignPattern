/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singltonpattern;


public class Book {
   public static Book b ; 
   public int quantity=1;
   private Book(){
       
   }
   
   public static synchronized  Book getInstance(){
       if(b==null)
           b=new Book();
       return b;
   }
   
   public void rent(){
       if(b!=null && quantity==1){
           quantity--;
           System.out.println("this book is available");
       }
       else
       System.out.println("this book is not available");
           
       
   }
}
