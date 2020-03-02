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
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle mt = new MyTriangle(1,1,1,1,3,4);
        System.out.println(mt.toString());
        System.out.println(mt.getPerimeter());
        mt.getType();
    }
}