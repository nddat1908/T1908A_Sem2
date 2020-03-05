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
public class TestShape {
    public static void main(String[] args) {
        Shape sp = new Shape();
        System.out.println(sp.toString());
        
        Scircle sc = new Scircle();
        System.out.println(sc.toString());
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        
        Square sq = new Square();
        sq.setWidth(5);
        sq.setLength(4);
        System.out.println(sq.toString());
    }
}   
