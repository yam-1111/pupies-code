package act5;

/*
* @author : Hinay, Anthony John C.
*/

// package oop;

import java.util.Scanner;

class act5b {

    static int NUM_LIMIT = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;

        System.out.println("============= MULTIPLICATION CALCULATOR =================");
        System.out.print(
                "How many rows and collumn of multiplication table\n[default : 10]: ");
        String _row = input.nextLine();

        if (_row.isEmpty()) {
            row = 10;
        } else {
            row = Integer.parseInt(_row);
        }

        /* Rows */
        System.out.print("\n\t|");
        for (int i = 1; i <= row; i++) {
            System.out.printf("%2s%2d", "", i);
        }

        System.out.print("\n----------");
        for (int i = 1; i <= row; i++) {
            System.out.print("-----");
        }

        /* Cols */
        System.out.println("\n");
        for (int i = 1; i <= row; i++) {
            System.out.printf("%3s%2d%3s|", "", i, "");
            for (int j = 1; j <= row; j++) {
                System.out.printf("%2s%2d", "", i * j, "");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        input.close();
    }
}
