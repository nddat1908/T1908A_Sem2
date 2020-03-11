/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
    private double width,length;
    
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) *2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "width=" + width + ", length=" + length + '}';
    }
    
}
