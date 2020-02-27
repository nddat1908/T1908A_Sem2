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
public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(5,12,1998);
        System.out.println(d1);
  
        d1.setDay(33);
        d1.setMonth(13);
        d1.setYear(2000);
        d1.setDate(19, 8, 2001);
        System.out.println(d1.toString());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        System.out.println(d1.toString());
        
    }
}
