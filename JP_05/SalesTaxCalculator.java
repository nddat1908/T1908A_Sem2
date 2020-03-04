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
public class SalesTaxCalculator {
    public static void main(String[] args) {
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;
        
        double price,actualPrice,salesTax;
        double totalPrice = 0.0,totalActualPrice = 0.0,totalSalesTax = 0.0;
        
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        Scanner in = new Scanner(System.in);
        price = in.nextDouble();
        
        while(price!= SENTINEL){
            salesTax = price * 0.07;
            actualPrice = price - salesTax;
            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
            
            System.out.printf("Actual Price is: $%.2f",actualPrice);
            System.out.printf(", Sales tax is: $%.2f%n",salesTax);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = in.nextDouble();

        }
        System.out.printf("Total Price is: $%.2f%n",totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n",totalActualPrice);
        System.out.printf("Total Sales Tax is: $%.2f%n",totalSalesTax);
    }
}
