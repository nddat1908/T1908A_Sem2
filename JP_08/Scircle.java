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
public class Scircle extends Shape {
    private double radius;
    
    public Scircle(){
        super();
        this.radius = 1.0;
    }
    public Scircle(double radius){
        super();
        this.radius = radius;
    }
    public Scircle(double radius, String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Scircle["+super.toString() + "radius=" + radius + "]";
    }
    
}
