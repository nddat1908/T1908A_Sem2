/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Admin
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student ("Paul Lee",0.0);
        Student student2 = new Student ("Peter Tan",0.0);
        System.out.println("Name:"+student1.getName());
        System.out.println("Name:"+student2.getName());
      
        student1.setGpa(3.5);
        student2.setGpa(3.9);
        System.out.println("GPA:"+student1.getGpa());
        System.out.println("GPA:"+student2.getGpa());
        Student student3 = new Student() ;
        System.out.println("Name:" + student3.getName());
    }
}
