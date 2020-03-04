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
public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average=1;
        Scanner in = new Scanner(System.in);
        
        for (int studentNo = 1;studentNo <= NUM_STUDENTS;++studentNo){
            isValid = false;
            do{
            System.out.print("Enter the mark (0-100) for student " + studentNo+":");
            numberIn = in.nextInt();
          
            if(numberIn >= 0 && numberIn<=100){
                isValid = true;
            }else{
                System.out.println("Invalid input, try again...");
            }
           
        }while(!isValid);
        sum+=numberIn;
        average = (float)sum/studentNo;
        }
        
        System.out.println("The average is: " +(double) Math.round(average * 100) / 100);
    }
}
