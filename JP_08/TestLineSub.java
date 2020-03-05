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
public class TestLineSub {
    public static void main(String[] args) {
        LineSub lp1 = new LineSub(0,0,3,4);
        System.out.println(lp1);
        
        PointL pl1 = new PointL(5,6);
        PointL pl2 = new PointL(8,9);
        LineSub lp2 = new LineSub(pl1,pl2);
        System.out.println(lp2);
    }
}
