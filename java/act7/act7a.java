package act7;

import java.util.Scanner;

public class act7a{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Database db = new Database();
        String query = "", _brand = "", _model = "", _plate = "";
        char is_loop;
        int mode = 0, _reg_year;

        do {
            // reset the value to blank
            is_loop = ' ';

            System.out.println("-- WELCOME TO LTO DATABASE ---");
            System.out.println(
                    "[1] - search by brand\n[2] - search by model\n[3] - search by plate no.\n[4] - search by registration no.\n[5] - search by id\n[6] - Add new entry\n[7] - exit\n");
            db.len();
            System.out.print("---> "); mode = input.nextInt();
            switch (mode) {
                case 1:
                    input.nextLine(); System.out.print("Input Car Brand: ");query = input.nextLine();
                    db.search(query, "brand");
                    break;
                case 2:
                    input.nextLine(); System.out.print("Input Car model: ");query = input.nextLine();
                    db.search(query, "model");
                    break;
                case 3:
                    input.nextLine();System.out.print("Input Car plate number: "); query = input.nextLine();
                    db.search(query, "plate_no");
                    break;
                case 4:
                    input.nextLine(); System.out.print("Input Car registration year: ");query = input.nextLine();
                    db.search(query, "registration");
                    break;
                case 5:
                    input.nextLine(); System.out.print("Input Car ID: "); query = input.nextLine();
                    db.search(query, "id");
                    break;
                case 6:
                    System.out.println("--- Add new data: ---");
                    input.nextLine();
                    System.out.print("Car Brand: ");
                    _brand = input.nextLine();
                    System.out.print("Car Model: ");
                    _model = input.nextLine();
                    System.out.print("Car Plate no. : ");
                    _plate = input.nextLine();
                    System.out.print("Car year of registration: ");
                    _reg_year = input.nextInt();
                    db.append(_brand, _model, _plate, _reg_year);
                    System.out.println("---------------------------------");
                    break;
                case 7:
                    System.out.println("Goodbye!\n");
                    is_loop = 'n';
                    break;

                default:
                    System.out.println("Wrong choice. ");
                    break;
            }

            while (is_loop != 'y' && is_loop != 'n') {
                System.out.print("Do you want to try again? Y/N: ");
                String _is_loop = (input.next()).toLowerCase();
                is_loop = _is_loop.charAt(0);
                input.nextLine();
            }
        } while (is_loop != 'n');

        input.close();
    }
}
