import java.util.Scanner;

public class CurrencyConverter {
    
    static double USD_TO_EUR = 0.85;
    static double USD_TO_GBP = 0.75;
    static double USD_TO_INR = 74.57;
    static double EUR_TO_USD = 1.18;
    static double GBP_TO_USD = 1.33;
    static double INR_TO_USD = 0.013;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Currency Converter");
        
       
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter the source currency (USD, EUR, GBP, INR): ");
        String sourceCurrency = scanner.next().toUpperCase();
        
      
        System.out.print("Enter the target currency (USD, EUR, GBP, INR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
        
        if (convertedAmount != -1) {
        	// print formatted strings to the console
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency input.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        if (sourceCurrency.equals("USD")) {
            switch (targetCurrency) {
                case "EUR": return amount * USD_TO_EUR;
                case "GBP": return amount * USD_TO_GBP;
                case "INR": return amount * USD_TO_INR;
                default: return -1;
            }
        } else if (sourceCurrency.equals("EUR")) {
            switch (targetCurrency) {
                case "USD": return amount * EUR_TO_USD;
                default: return -1;
            }
        } else if (sourceCurrency.equals("GBP")) {
            switch (targetCurrency) {
                case "USD": return amount * GBP_TO_USD;
                default: return -1;
            }
        } else if (sourceCurrency.equals("INR")) {
            switch (targetCurrency) {
                case "USD": return amount * INR_TO_USD;
                default: return -1;
            }
        }
        return -1; // Invalid input
    }
}
