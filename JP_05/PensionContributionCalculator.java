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
public class PensionContributionCalculator {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int salary, age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        System.out.print("Enter the monthly salary: $");
        Scanner in = new Scanner(System.in);
        salary = in.nextInt();
        System.out.print("Enter the age: ");
        age = in.nextInt();
        
        if(age <= 55){
            employeeContribution = salary * 0.2;
            employerContribution = salary * 0.17;
        }else if(age <= 60){
            employeeContribution = salary * 0.13;
            employerContribution = salary * 0.13;
        }else if(age <= 65){
            employeeContribution = salary * 0.075;
            employerContribution = salary * 0.09;
        }else{
            employeeContribution = salary * 0.05;
            employerContribution = salary * 0.075;
        }
        System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", employeeContribution + employerContribution);
    }
                                  
}
