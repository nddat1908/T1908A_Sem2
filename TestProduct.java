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
        Product p1 = new Product(1,"NDD",1000000,1,null);
        System.out.println(p1.toString());
//        System.out.println("Price: " + p1.getPrice());
//        System.out.println("Qty: " + p1.getQty());
//        System.out.println("Desciption: " + p1.getDescription());
        Product p2 = new Product(2,"PPP",10,1,null);
        System.out.println(p2.toString());
        
        p2.setPrice(9);
        System.out.println("Price: " + p2.getPrice());
    }
}
