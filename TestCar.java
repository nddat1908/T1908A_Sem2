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
public class TestCar {
    public static void main(String[] args) {
        //khoi tao doi tuong (Object)
        Car car1 = new Car();
        //goi phuong thuc (Method)
        car1.move();
        car1.park();
        car1.accelerate();
    }
}
