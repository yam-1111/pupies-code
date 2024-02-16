/*
 *  Computes the area of shapes
 * author : Hinay, Anthony C.
 */

 package act4;

import java.util.Scanner;

public class act4e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input choice
        System.out.println("++++++++++++ Area Calculator ++++++++++++");
        System.out.printf("\nChoose your operations:\n[C] - Circle\n[R] - Rectangle\n[S] - Square\n[E] - Exit\n");
        System.out.print("Please input your choice --> ");
        char choice = (input.nextLine().toUpperCase()).charAt(0);

        // checks input and assign on the case statement
        switch (choice) {
            case 'C':
                System.out.println("--- COMPUTATION FOR AREA OF CIRCLE ---");
                System.out.print("The value of  radius: ");
                double radius = input.nextDouble();
                System.out.printf("The area of circle is %.4f\n", Math.PI * radius * radius);
                break;
            case 'R':
                System.out.println("--- COMPUTATION FOR AREA OF RECTANGLE ---");
                System.out.print("The value of length: ");
                double length = input.nextDouble();
                System.out.print("The value of width: ");
                double width = input.nextDouble();
                System.out.printf("The area of rectange is %.4f\n", length * width);

                break;
            case 'S':
                System.out.println("--- COMPUTATION FOR AREA OF SQUARE ---");
                System.out.print("The value of side: ");
                double side = input.nextDouble();
                System.out.printf("The area of square is %.4f\n", side * side);
                break;
            case 'E':
                System.out.println("--- EXITING NOW THE PROGRAM ---");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! please try again");
                // go back to start if invalid choice
                main(new String[0]);
                break;
        }
        input.close();
    }
}
