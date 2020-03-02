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
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        
        p1.setX(8);
        p1.setY(6);
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        
        MyPoint p2 = new MyPoint(0,4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance());
        
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length;i++){
            points[i] = new MyPoint(i+1,i+1);
        }
        for (int i = 0;i<points.length;i++){
            System.out.println(points[i].toString());
        }
    }
}
