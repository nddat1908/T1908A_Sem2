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
public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int sum = 0;
        System.out.print("Enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        inNumber = in.nextInt();
      
        while(inNumber > 0){
            inDigit = inNumber % 10;
            inNumber /= 10;
            sum += inDigit;
 
        }
        System.out.println("The sum of all digits is: " + sum);
    }
    
}
