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
public class Circle {
    //dinh nghia thuoc tinh
    private double radius;
    private String color;
    //dinh nghia constructor de khoi tao doi tuong
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
