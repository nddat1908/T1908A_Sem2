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
public class Lab01 {
    public static void main(String[] args) {
        //khoi tao doi tuong (Object)
        Student student1 = new Student("Paul Lee", 0.0);
        Student student2 = new Student("Peter Tan", 0.0);
        
        //goi phuong thuc (Method)
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student1.getGpa());
        System.out.println(student2.getGpa());
        student1.setGpa(3.5);
        student2.setGpa(3.9);
        System.out.println(student1.getGpa());
        System.out.println(student2.getGpa());
        
        Circle c1 = new Circle();
        System.out.println("The radius is: "+ c1.getRadius());
        System.out.println("The color is: "+ c1.getColor());
        System.out.println("The area is:"+ c1.getArea());
        
        SoccerPlayer SP1 = new SoccerPlayer();
        SP1.run();
        SP1.jump();
        SP1.kickBall();
       
        Car car1 = new Car();
        car1.move();
        car1.park();
        car1.accelerate();
    }
}
