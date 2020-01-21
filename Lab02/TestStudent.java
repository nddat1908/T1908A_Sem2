/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Admin
 */
public class TestStudent {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student(1,"Nguyen Van A",true);
        
        studentB.printInfo();
        
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
