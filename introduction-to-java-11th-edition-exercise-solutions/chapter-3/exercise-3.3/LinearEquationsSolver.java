import java.util.Scanner;

public class LinearEquationsSolver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        float a = input.nextFloat();

        System.out.println("Enter the value for b: ");
        float b = input.nextFloat();

        System.out.println("Enter the value for c: ");
        float c = input.nextFloat();

        System.out.println("Enter the value for d: ");
        float d = input.nextFloat();

        System.out.println("Enter the value for e: ");
        float e = input.nextFloat();

        System.out.println("Enter the value for f: ");
        float f = input.nextFloat();



        float x =   ((e * d) - (b * f)) / 
                    ((a * d) - (b * c));

        float y =   ((a * f) - (e * c)) / 
                    ((a * d) - (b * c));

        if ((a * d) - (b * c) == 0){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("x is " + x + " and y is " + y);
        }
    
    }


}