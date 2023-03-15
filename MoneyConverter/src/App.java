import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double exchangeRateUSDToEUR = 0.85;
        double exchangeRateEURToUSD = 1.18;
        double exchangeRateUSDtoCAD = 1.26;
        double exchangeRateCADtoUSD = 0.79;
        double exchangeRateEURtoCAD = 1.48;
        double exchangeRateCADtoEUR = 0.68;
        
        System.out.println("Welcome to the currency converter!");
        System.out.println("Please enter the amount of money you want to convert:");
        double amount = input.nextDouble();
        
        System.out.println("Please enter the currency you want to convert from (USD, EUR, or CAD):");
        String fromCurrency = input.next().toUpperCase();
        
        System.out.println("Please enter the currency you want to convert to (USD, EUR, or CAD):");
        String toCurrency = input.next().toUpperCase();
        
        double convertedAmount = 0;
        
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            convertedAmount = amount * exchangeRateUSDToEUR;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            convertedAmount = amount * exchangeRateEURToUSD;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("CAD")) {
            convertedAmount = amount * exchangeRateUSDtoCAD;
        } else if (fromCurrency.equals("CAD") && toCurrency.equals("USD")) {
            convertedAmount = amount * exchangeRateCADtoUSD;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("CAD")) {
            convertedAmount = amount * exchangeRateEURtoCAD;
        } else if (fromCurrency.equals("CAD") && toCurrency.equals("EUR")) {
            convertedAmount = amount * exchangeRateCADtoEUR;
        } else {
            System.out.println("Invalid input, please try again.");
            System.exit(0);
        }
        
        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}
