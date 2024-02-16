package act5;

/*
 * @author : Hinay, Anthony John C.
 */

//package oop;

import java.util.Scanner;

public class act5a_2{ 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        while (count < 10) {
            System.out.printf("%d.) %s\n", count+1, name);
            count++;
        }


        input.close();

    }
}