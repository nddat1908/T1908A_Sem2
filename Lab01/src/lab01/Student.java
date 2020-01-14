/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Admin
 */
public class Student {
    //dinh nghia thuoc tinh
    private String name;
    private double gpa;
    
    //dinh nghia constructor de khoi tao doi tuong
    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    
     //dinh nghia cac phuong thuc
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
