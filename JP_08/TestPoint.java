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
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(5);
        p1.setY(6);
        System.out.println(p1);
        p1.setXY(7, 8);
        System.out.println(p1.toString());
        
        MovablePoint mp = new MovablePoint(31,32);
        mp.setX(21);
        mp.setY(22);
        System.out.println(mp.toString());
        System.out.println(mp.move());
    }
    
    
}
