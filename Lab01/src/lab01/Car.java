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
public class Car {
    private int x,y;
    private int speed;
    private String plateNumber;
    
    public Car(){
        System.out.println("My car!");
    }
    public void move(){
        System.out.println("Move!");
    }
    public void park(){
        System.out.println("Park!");
    }
    public void accelerate(){
        System.out.println("Accelerate!");
    }
}
