/*
 *  Checks if password is match using if and else
 * author : Hinay, Anthony C.
 */

 package act4;

import java.util.Scanner;

public class act4c_1{
    public static void main(String[] args) {
        String password = "ANTHONY";
        Scanner input = new Scanner(System.in);
        
        // inputs user
        System.out.print("Enter your password: ");
        String answer = input.nextLine();

        // checks password is correct
        if(answer.equals(password)){
            System.out.printf("Your password is granted: %s\n", answer);
        }
        else{
            System.out.printf("Your password is denied: %s\n", answer);
        }

        input.close();
    }
    
}