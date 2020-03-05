/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author Admin
 */
public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Dat","Hanoi","X",2020,5000);
        System.out.println(s1.toString());
        
        Staff f1 = new Staff("NDD","HD","FPT",3000);
        System.out.println(f1.toString());
    }
    
   
    
}
