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
public class CylinderComputation {
    public static void main(String[] args) {
        double radius,height,baseArea,surfaceArea,volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;
        System.out.printf("BaseArea is: %.2f%n",baseArea);
        System.out.printf("SurfaceArea is: %.2f%n",surfaceArea);
        System.out.printf("Volume is: %.2f%n",volume);
    }
}
