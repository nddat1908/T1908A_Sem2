/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_05;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Swap2Integers {
    public static void main(String[] args) {
        int x,y;
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        x = in.nextInt();
        System.out.print("Enter second integer: ");
        y = in.nextInt();
            temp = x;
            x = y ;
            y = temp;
            System.out.println("After the swap, first integer ís: "+ x+", second integer is: "+y);
    }
}
