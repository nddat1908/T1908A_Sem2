/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Admin
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3,7);
        rec.display();
        rec.setWidth(5);
        rec.setHeight(5);
        rec.display();
        rec.getPerimeter();
        System.out.println("Chu vi = "+ rec.getPerimeter());
        System.out.println("Dien tich = "+rec.getArea());
    }
}
