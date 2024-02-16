package act5;

/*
 * @author : Hinay, Anthony John C.
 */

//package oop;

import java.util.Scanner;

public class act5c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String customer_name, item_purchase;
        double total_price, price, cash;
        int qty;
        char is_loop;

        do{
            // reset the value to blank
            is_loop = ' ';

            System.out.print("Please enter Customer name: ");
            customer_name = input.nextLine();
            System.out.print("Please enter Purchased item: ");
            item_purchase = input.nextLine();

            System.out.print("Please enter Quantity: ");
            qty = input.nextInt();
            System.out.print("Please enter Price: ");
            price = input.nextDouble();
            System.out.print("Please enter Cash: ");
            cash = input.nextDouble();

            total_price = qty * price;
            System.out.printf("Customer name: %s\n", customer_name);
            System.out.printf("Purchased item: %s\n", item_purchase);
            System.out.printf("Quantity: %d\n", qty);
            System.out.printf("Price: %.2f\n", total_price);

            if(total_price >= 1000){
                total_price = total_price - (total_price * 0.3);
            }
            System.out.printf("Total bill: %.2f\n", total_price);
            System.out.printf("Cash : %.2f\n", cash);
            System.out.printf("Change : %.2f\n", cash - total_price);
        
            while(is_loop != 'y' && is_loop != 'n'){
                System.out.print("Do you want to try again? Y/N: ");
                String _is_loop = (input.next()).toLowerCase();
                is_loop = _is_loop.charAt(0);
                input.nextLine();
            }
        }while(is_loop !='n');

        input.close();
    }
}
