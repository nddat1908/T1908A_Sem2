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
public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rt = new MyRectangle(1,2,3,4);
        System.out.println(rt.toString());
        System.out.println("Perimeter = "+rt.getPerimeter());
    }
}
