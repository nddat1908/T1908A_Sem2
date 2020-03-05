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
public class TestLineP {
    public static void main(String[] args) {
        LineP lp1 = new LineP(0,0,3,4);
        System.out.println(lp1);
        
        PointL pl1 = new PointL(5,6);
        PointL pl2 = new PointL(8,9);
        LineP lp2 = new LineP(pl1,pl2);
        System.out.println(lp2);
    }
}
