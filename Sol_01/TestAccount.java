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
public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account("acc1","A");
        System.out.println("ID: " + acc.getID());
        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Debit: " + acc.debit(15000));
        System.out.println("TranferTo: " + acc.credit(5000));
        System.out.println(acc.toString());
        
        Account acc2 = new Account("acc2","B",10000);
        
        System.out.println("ID: " + acc2.getID());
        System.out.println("Name: " + acc2.getName());
        System.out.println("Balance: " + acc2.getBalance());
        System.out.println("Debit: " + acc2.debit(5000));
        System.out.println("TranferTo: " + acc2.credit(10000));
        
//        System.out.println(acc2.transferTo(acc2, amount));
        System.out.println(acc2.toString());
    }
}
