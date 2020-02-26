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
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }
    public Circle(double r,String c){
        this.radius = r;
        this.color = c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
     public double getCircumference(){
        return 2 * radius * Math.PI;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String toString(){
        return "Circle[radius =" + radius + " color= " + color +"]";
    }
}

