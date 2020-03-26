package Giftview;

import Giftcontroller.GiftController;
import Giftmodel.Gift;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Giftshop {
    ArrayList<Gift> list = new ArrayList<>();

    public static void main(String[] args) {
        final int SENTINEL = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Going shop...");
        GiftController controller = new GiftController();
        controller.menu();
        n = scanner.nextInt();


        while (n != SENTINEL) {
            if (n == 1) {
                System.out.println("Book List");
                controller.selectBook();

            }else if(n == 2){
                System.out.println("Enter id: ");
                int id = scanner.nextInt();
                System.out.println("Enter name: ");
                String name = scanner.next();
                System.out.println("Enter price: ");
                double price = scanner.nextDouble();
                System.out.println("Enter qty: ");
                int qty = scanner.nextInt();
                Gift gift = new Gift(id, name, price, qty);
                controller.getInsert(gift);
            }else if(n == 3){
                System.out.println("Enter id: ");
                int id = scanner.nextInt();
                controller.getDelete(id);
            }
            controller.menu();
            n = scanner.nextInt();
            }
            System.out.println("Bye....See you again!");
        }
    }
