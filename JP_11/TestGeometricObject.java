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
public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject go = new GeoCircle();
        System.out.println(go);
        System.out.println(go.getPerimeter());
        System.out.println(go.getArea());
    }
     
}
