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
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem item1 = new InvoiceItem("a123","desc",5,3000);
        System.out.println(item1.getTotal());
        System.out.println(item1.toString());
    }
}
