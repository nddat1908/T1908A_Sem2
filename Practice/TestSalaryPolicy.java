/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestSalaryPolicy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        EmployeeFullTime full1 = new EmployeeFullTime(5000);
        EmployeePartime part1 = new EmployeePartime(5000);
        System.out.print("BaseSalary FullTime: ");
        full1.setBaseSalary(in.nextFloat());
        System.out.print("BaseSalary Partime: ");
        part1.setBaseSalary(in.nextFloat());
        System.out.println("Salary FullTime = "+full1.getSalary());
        System.out.println("Salary Partime = "+part1.getSalary());
    }
}
