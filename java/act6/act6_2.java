/*
 * @author Hinay, Anthony John C.
 */

//  package act6;

import java.util.Scanner;

public class act6_2 {

    static int NUM_ARRAY = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[NUM_ARRAY];
        double[] prelims = new double[NUM_ARRAY];
        double[] midterms = new double[NUM_ARRAY];
        double[] finals = new double[NUM_ARRAY];
        
        for(int i=0; i<NUM_ARRAY; i++){
            /*Name input */
            System.out.print("Name \t\t: ");
            name[i] = input.nextLine();

            /*Prelims*/
            System.out.print("Prelims\t\t: ");
            prelims[i] = input.nextDouble();

            /*Midterms*/
            System.out.print("Midterm\t\t: ");
            midterms[i] = input.nextDouble();

            /*Finals*/
            System.out.print("Finals\t\t: ");
            finals[i] = input.nextDouble();

            System.out.printf("\nAverage \t: %.1f\n\n",
            (prelims[i] + midterms[i] + finals[i]) / 3
            );

            input.nextLine();
        }

        input.close();
    }
}
