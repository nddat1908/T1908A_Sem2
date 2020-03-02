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
public class TestBook2 {
    public static void main(String[] args) {
    Author[] authors = new Author[2];
        authors[0] = new Author("NDD","dat1908@gmail.com",'m');
        authors[1] = new Author("Dac Dat","dat2k1@gmail.com",'m');
        
        Book2 javaD = new Book2("JavaforD",authors,19.99,99);
        System.out.println(javaD);
    }
   
    
}
