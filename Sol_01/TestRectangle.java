/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Admin
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
        System.out.println(rec1.toString());
        rec1.setLength(5);
        rec1.setWidth(4);
        System.out.println("Length: " + rec1.getLength());
        System.out.println("Width: " + rec1.getWidth());
    }
}
