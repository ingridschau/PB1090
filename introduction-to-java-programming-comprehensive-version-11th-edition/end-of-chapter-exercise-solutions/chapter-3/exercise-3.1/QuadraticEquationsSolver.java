import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquationsSolver {
    public static void main(String[] args) {
        //use ',' for decimal

        Scanner input = new Scanner(System.in);
        double a;

        System.out.println("Please enter a value for a: ");
        a = input.nextDouble();
        System.out.println("Please enter a value for b: ");
        double b = input.nextDouble();
        System.out.println("Please enter a value for c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);


        if (discriminant > 0) {
            System.out.println("The equation has two real roots: \nRoot 1: " + root1 + "\nRoot 2: " + root2);
        }
        if (discriminant == 0) {
            System.out.println("The equation has one root: \nRoot: " + root1);
        }
        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }

        input.close();
        
    }
}