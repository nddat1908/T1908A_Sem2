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
public class Student {
        private String name;
        private double gpa;
        
        public Student(String name,double gpa){
            this.name = name;
            this.gpa = gpa;
        }
        public Student(){
            name = "dat";
            gpa = 5;
        }
        public String getName(){
            return name;
        }
        public double getGpa(){
            return gpa;
        }
        public void setGpa(double gpa){
            this.gpa =gpa;
        }
}
