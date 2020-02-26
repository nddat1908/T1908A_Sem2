/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Admin
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Dac"," Dat ",5000);
        System.out.println("Name: " + emp1.getName());
        System.out.println("AnnualSalary: " + emp1.getAnnualsalary());
        
        System.out.println("raiseSalary: " + emp1.raiseSalary(20));
        System.out.println(emp1.toString());
    }
}
 