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
public class TestAuthor {
    public static void main(String[] args) {
        Author at1 = new Author("NDD","nddatfpt@gmail.com",'m');
        System.out.println(at1);
        at1.setEmail("FPT@gmail.com");
        System.out.println("Name: " + at1.getName());
        System.out.println("Email: " + at1.getEmail());
        System.out.println("Gender: " + at1.getGender());
    }
}
