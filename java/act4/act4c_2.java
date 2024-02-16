/*
 *  Computes if odd or even the given number
 * author : Hinay, Anthony C.
 */

 package act4;

import java.util.Scanner;

public class act4c_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n+++++++++++++++++++++++++++");
        System.out.printf("\tOdd or Even\n");

        // inputs user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // checks for odd / even
        if(num%2==0)
            System.out.printf("%d is an even number\n", num);
        else
             System.out.printf("%d is an odd number\n", num);
        System.out.println("\n+++++++++++++++++++++++++++");
        input.close();
    }
}
