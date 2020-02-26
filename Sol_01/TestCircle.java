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
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println(c1.toString());
        
        Circle c2 = new Circle(1.2);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c2 );
        
        Circle c3 = new Circle(3.0,"white");
        System.out.println("Radius: " + c3.getRadius() + " Color: " + c3.getColor());
        
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("Radius is: " + c4.getRadius());
        c4.setColor("black");
        System.out.println("Color is: " + c4.getColor());
        
        Circle c5 = new Circle(1.0);
        System.out.println("Circumference: " + c5.getCircumference());
        System.out.println("Area: " + c5.getArea());
    } 
}
