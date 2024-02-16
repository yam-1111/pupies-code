package act3;

import javax.swing.JOptionPane;

public class act3d {
    public static void main(String[] args) {
        try {
            String convertDollar = JOptionPane.showInputDialog(null, "Amount of dollars to be converted: ");

            // Check if the input is empty
            if (convertDollar == null || convertDollar.trim().isEmpty()) {
                throw new NumberFormatException("Input is empty");
            }

            // Convert
            double dollarToBeConverted = Double.parseDouble(convertDollar) * 50.50;

            // Display result
            JOptionPane.showMessageDialog(null, String.format(
                    "You have succesfully converted.\n$ %.2f = ₱ %.2f", Double.parseDouble(convertDollar), dollarToBeConverted
            ));
        } catch (NumberFormatException e) {
            int option = JOptionPane.showConfirmDialog(null, "Invalid input! Do you want to try again?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                main(args); // Restart the program
            } else {
                JOptionPane.showMessageDialog(null, "Program terminated.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
