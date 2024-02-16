/*
 *  Computes the  grades through using if, elseif and else
 * author : Hinay, Anthony C.
 */

 package act4;
import java.util.Scanner;

public class act4c_3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your grade: ");
       double grade = input.nextDouble();

       System.out.print("Your grade is: "); 

       // validate the grade
        if (grade >= 99) {
            System.out.print("1.00");
        } 
        else if (grade >= 96) {
            System.out.print("1.25");
        } 
        else if (grade >= 93) {
            System.out.print("1.50");
        } 
        else if (grade >= 90) {
            System.out.print("1.75");
        } 
        else if (grade >= 87) {
            System.out.print("2.00");
        } 
        else if (grade >= 84) {
            System.out.print("2.25");
        } 
        else if (grade >= 81) {
            System.out.print("2.50");
        } 
        else if (grade >= 77) {
            System.out.print("2.75");
        } 
        else if (grade >= 75) {
            System.out.print("3.00");
        } else {
            System.out.print("5.00");
        }

    System.out.println("\n");
    input.close();
    }  
}
