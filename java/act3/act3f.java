package act3;

import javax.swing.*;

public class act3f {
    public static void main(String[] args) {
        String workerName = "Juan Dela Cruz";
        int hoursPerWeek = 40;
        double hourlyRate = 84.50;

        double grossPay = hoursPerWeek * hourlyRate;
        JOptionPane.showMessageDialog(null, String.format(
            "Worker : %s\n\nHours per week: %d\nHourly rate: %.2f / hr\n%s's gross pay is: %.2f",
            workerName, hoursPerWeek, hourlyRate, workerName, grossPay
        ));
    }
}
