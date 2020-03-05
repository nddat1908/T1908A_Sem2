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
public class Cylinder52 {
    private Circle base;
    private double height;
    
    public Cylinder52(){
        base = new Circle();   
        this. height = 1.0;
    }
    public Cylinder52(double height){
        this.base = base;
        this.height = height;
    }
    public Cylinder52(double radius, double height){
        this.base = base;
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return base.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + base.toString() + "height=" + height;
    }
}
