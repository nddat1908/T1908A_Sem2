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
public class GeoCircle implements GeometricObject {
    private double radius;
    
    public GeoCircle(double radius){
        this.radius = radius;
    }
    public GeoCircle(){
        this.radius = 1;
    }

    @Override
    public String toString() {
        return "GeoCircle[" + "radius=" + radius + "]";
    }
    
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
