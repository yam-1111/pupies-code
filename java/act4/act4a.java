/*
 *  Computes the grade and display in sequentially
 * author : Hinay, Anthony C.
 */

 package act4;

import java.util.Scanner;

public class act4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Grade Calculator ---\n");

        System.out.print("Enter grade for prelim: ");
        double prelim = input.nextDouble();
        System.out.print("Enter grade for midterm: ");
        double midterm = input.nextDouble();
        System.out.print("Enter grade for finals: ");
        double finals = input.nextDouble();

        double gradeAvg = (prelim+ midterm + finals) / 3;

        System.out.println("\n\n=====================");
        System.out.printf(
            "Grade for prelim: %.2f\nGrade for midterm: %.2f\nGrade for finals: %.2f\n\nFinal average grade: %.2f\n\n", prelim, midterm, finals, gradeAvg
        );
         System.out.println("=====================");
        input.close();
    }
}
