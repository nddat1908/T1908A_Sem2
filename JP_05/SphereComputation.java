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
public class SphereComputation {
    public static void main(String[] args) {
        double surfaceArea,radius,volume,baseArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4/3 * Math.PI*radius*radius*radius;
        System.out.printf("SurfaceArea is : %.2f%n",surfaceArea);
        System.out.printf("Volume is : %.2f%n",volume);
    }
}
