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
public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(24,0,1);
        System.out.println(t1);
        System.out.println(t1.previousSecond().previousSecond());
//        
//        t1.setHour(4);
//        t1.setMinute(5);
//        t1.setSecond(6);
//        System.out.println(t1);
//        
//        t1.setTime(23, 59, 58);
//        System.out.println(t1);
//        
//        System.out.println(t1.nextSecond());
//        System.out.println(t1.nextSecond().nextSecond().nextSecond());
//     
    }
}
