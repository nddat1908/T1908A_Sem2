/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowork2020;

/**
 *
 * @author Admin
 */
public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Qty: " + p1.getQty());
        Product p2 = new Product();
        p2.setPrice(7);
        System.out.println(p2.getPrice());
    }
}
