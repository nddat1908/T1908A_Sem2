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
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(int id,String firstName,String lastName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID(){
        return id;
    }
    public String firstName(){
        return firstName;
    }
    public String lastName(){
        return lastName;
    }
    public String getName(){
        return firstName + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualsalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        return salary + salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
    
}
