/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

import java.util.Arrays;
        
/**
 *
 * @author Admin
 */

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book2(String name,Author[] authors,double price,int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
        return name;
    }
    public Author[] getAuthor(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString() {
      return "'" + name + "' by " + Arrays.toString(authors);  // author.toString()
   }
}
