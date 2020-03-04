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
public class Add2Integer {
    public static void main(String[] args) {
        int number1,number2,sum;
        Scanner in  = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        number1 = in.nextInt();
        System.out.print("Nhập số thứ hai: ");
        number2 = in.nextInt();
        sum = number1 + number2; 
        System.out.print("Tổng của 2 số : " + sum);
        in.close();
    }
}
