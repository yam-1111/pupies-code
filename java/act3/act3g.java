package act3;

public class act3g {
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

        //output
        System.out.println("\t#######################################");
        System.out.println("\t           Interest Calculator");
        System.out.println("\t#######################################");
        System.out.printf("\n\nClient Name: %s\nPrincipal Amount: Php. %d\nRate: %.2f%% \nWitholding Tax: Php. %.2f\nNet Interest: Php. %.2f\n",
        workerName, principal, rate*100, withholdingTax, netInterest);
    }
}
