package act3;


public class act3e {
    public static void main(String[] args) {
        String workerName = "Juan Dela Cruz";
        int hoursPerWeek = 40;
        double hourlyRate = 84.50;
        double grossPay = hoursPerWeek * hourlyRate;

        System.out.println("########################################");
        System.out.printf("Worker Name : %s\nHours per Week: %d\nHourly Rate: %.2f\n\n%s's gross pay is: Php. %.2f\n", workerName, hoursPerWeek, hourlyRate, workerName, grossPay);
        System.out.println("########################################");
    }
}
