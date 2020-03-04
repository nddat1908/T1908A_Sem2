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
public class SumProductMinMax3 {
    public static void main(String[] args) {
        int sum = 0,product = 1;
        int[] ar = {8,2,9};
        int min = ar[0];
        int max = ar[0];
        for(int i = 0;i < ar.length;i++){
          
            sum += ar[i];
            product = ar[i];
            if(ar[i] < min){
                min = ar[i];
            }
            if(max < ar[i]){
               max = ar[i];
            }
        }
        
        System.out.println("The sum: "+sum);
        System.out.println("The product " + product);
        System.out.println("The min " + min);
        System.out.println("The max " + max);
        
    }
}
