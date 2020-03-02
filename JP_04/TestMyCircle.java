/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle mc  = new MyCircle();
        System.out.println(mc.getCenterX());
        System.out.println(mc.getCenterY());
        mc.setCenterX(1);
        mc.setCenterY(2);
        System.out.println("X = " + mc.getCenterX());
        System.out.println("Y = " + mc.getCenterY());
        
        System.out.println(mc.toString());
        System.out.println("Area = " + mc.getArea());
        System.out.println("Cirumference = " + mc.getCirumference());
        
        MyCircle mc2 = new MyCircle();
        mc2.setCenterX(5);
        mc2.setCenterY(6);
        System.out.println(mc.distance(mc2));
    }
}
