import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEAR;


        System.out.print("Period (Years): ");
        byte periodInYear = scanner.nextByte();
        int periodInMonth = periodInYear * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonth))
                / (Math.pow(1 + monthlyInterestRate, periodInMonth) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.print("Mortgage: " + formattedMortgage);

    }
}
