package act3;
import java.util.Scanner;

public class act3c {
    public static void main(String[] args) {
        System.out.println("\t#######################################");
        System.out.println("\t    Welcome to the Dollar Converter");
        System.out.println("\t#######################################");

        // input the dollar
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("\nAmount of dollars to be converted: ");
            String convertDollar = scan.nextLine();

                // Check if the input is empty
            if (convertDollar == null || convertDollar.trim().isEmpty()) {
                throw new NumberFormatException();
            }

             // Convert
             double dollarToBeConverted = Double.parseDouble(convertDollar) * 50.50;

            System.out.printf("\n\nYou have succesfully converted.\n$ %.2f = ₱ %.2f\n", Double.parseDouble(convertDollar), dollarToBeConverted);
        }
        catch(NumberFormatException e){
            System.out.print("Invalid input! Do you want to try again? [1 - yes 0 - no]: ");
            int option = scan.nextInt();

            if(option==1){
                main(args);
            }
            else{
                System.out.println("Program has been terminated.\n");
            }
            scan.close();
        }

    }
}
