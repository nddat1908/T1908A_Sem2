package Java2_02;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        double average = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Enter " + n + " integer values.");

        int[] Array  = new int[n];
        for ( int i = 0 ; i< n;i++){
            Array[i] = scanner.nextInt();
        }
        for ( int i = 0 ; i< n;i++){

            System.out.println("Element " + i +", typed value was " + Array[i]);
        }

        for (int i = 0;i<n;i++){
            sum += Array[i];
            average = (double)sum/ n;
        }





        System.out.println("Avarage is " + average);
        System.out.println("==============");
        for (int i = 0;i <n;i++){
            if(Array[i] > average){
                System.out.println("Element " + i +", typed value was " + Array[i]);
            }
        }


    }
}
