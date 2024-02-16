package act5;

/*
 * @author : Hinay, Anthony John C.
 */

//package oop;

import java.util.Scanner;

public class act5a_1{ 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        for(int i=0;i<10;i++){
            System.out.printf("%d.) %s\n", i+1, name);
        }
        input.close();

    }
}