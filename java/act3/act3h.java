
package act3;

import javax.swing.JOptionPane;

public class act3h {
    public static void main(String[] args) {
        String workerName = "Maria";
        int principal = 30_000;
        double rate = 0.12;
        int timeInDays = 30;
        double interest = principal * rate * (timeInDays / 365.0);

        // compute the withholding tax
        double withholdingTaxRate = 0.10;
        double withholdingTax = interest * withholdingTaxRate;

        // compute the net interest
        double netInterest = interest - withholdingTax;

        JOptionPane.showMessageDialog(null, String.format(
        "\t\tTime Deposit Calculator\nClient Name : %s\n\nPrincipal Amount: Php. %d\nRate: %.2f%%\nWithholding Tax: Php. %.2f\nNet Interest Php. %.2f",
        workerName, principal, (rate * 100), withholdingTax, netInterest
        ), "Interest Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}
