/*
 *  Checks if grade is match on given criteria using if statement
 * author : Hinay, Anthony C.
 */

 package act4;

import java.util.Scanner;



public class act4b{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // inputs the user
        System.out.print("Enter a grade: ");
        String _grade = (input.nextLine()).toUpperCase();
        // convert to char since equal operator cannot be used on string
        char grade = _grade.charAt(0);

        // validates if the grade fall on criteria
        if(grade=='A') System.out.printf("%s is your grade and you are EXCELLENT", grade);
        if(grade=='B') System.out.printf("%s is your grade and you are VERY GOOD", grade);
        if(grade=='C') System.out.printf("%s is your grade and you are GOOD", grade);
        if(grade=='D') System.out.printf("%s is your grade and you are FAIR", grade);
        if(grade=='E') System.out.printf("%s is your grade and you are POOR", grade);
        if(grade=='F') System.out.printf("%s is your grade and you are NEED IMPROVEMENT", grade);

        System.out.println("\n");
        input.close();

    }
}