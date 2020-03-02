/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class TestBook {
    public static void main(String[] args) {
        Author at1 = new Author("NDD","nddatfpt@gmail.com",'m');
        System.out.println(at1);
        
        Book bk = new Book("JavaCODE",at1,19.95,99);
        System.out.println(bk);
        
        bk.setPrice(29.95);
        bk.setQty(28);
        System.out.println("Name: " + bk.getName());
        System.out.println("Price: " +bk.getPrice());
        System.out.println("Qty: " + bk.getQty());
        System.out.println("Author: " + bk.getAuthor());
        System.out.println("Author's name: " + bk.getAuthor().getName());
        System.out.println("Author's email: " + bk.getAuthor().getEmail());
        
        Book anotherBook = new Book("more Java",new Author("Dac Dat","dat2001@gmail.com",'m'),29.95);
        System.out.println(anotherBook);
        
        System.out.println(anotherBook.getAuthorName());
    }
}
