
/* 
(Conversions between pounds and kilograms) Write a class that contains
the following two methods: 

Convert from pounds to kilograms
public static double poundsToKilograms(double pounds)

Convert kilograms to pounds
public static double kilogramsToPounds(double kilograms)

The formula for conversion is:

pound = 0.453 * kilogram
kilogram = 2.204 * pound

Write a test program that pinvokes these methods to display the following tables:

kilograms   pounds  | pounds   kilograms
----------------------------------------
1           2.204   | 20       9.09
2           4.409   | 25       15.538
...
197        454.9    | 60       37.290
199        496.9    | 65       40.398

*/

public class ConvertPoundsAndKg {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i <= 99; i++) {
            System.out.printf("%-15d%-15.1f%-5s%-15d%-15.2f\n", 1 + i * 2, kilogramToPound(1 + i * 2), "|", 20 + 5 * i, poundToKilogram(20 + 5 * i));
        }
    }

    // Convert from pounds to kilograms
    public static double poundToKilogram(double pound) {
        return 0.453 * pound;
    }

    // Convert from kilograms to pounds
    public static double kilogramToPound(double kilogram) {
        return 2.204 * kilogram;
    }
}

