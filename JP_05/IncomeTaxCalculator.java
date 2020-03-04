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
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        
        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxableIncome: $");
        taxableIncome = in.nextInt();
        
        if(taxableIncome <= 20000){
            taxPayable = taxableIncome * 0;
        }else if(taxableIncome <= 40000){
            taxPayable = 20000 * 0 + (taxableIncome - 20000) * 0.1;
        }else if(taxableIncome <= 60000){
            taxPayable = 20000 * 0 + 20000 * 0.1 + (taxableIncome - 40000) * 0.2;
            
        }else{
            taxPayable = 20000 * 0 + 20000 * 0.1 + 20000 * 0.2  +(taxableIncome - 60000) * 0.3;
        }
        
        
        System.out.printf("The imcome tax payable is: $%.2f%n",taxPayable);
        
        double sale = 0;
        sale = taxPayable * 0.1;
        double s = 0;
        if(sale <= 1000){
            s = taxPayable - sale;
        }else{
            s = taxPayable - 1000;
        }
        System.out.printf("The imcome tax payable after sale is: $%.2f%n",s);
    }
    
}
