import java.lang.Math;
import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center of the pentagon to a vertex: ");
        
        float length = input.nextFloat();
        float pi = (float) Math.PI;
        float side = (float) (2 * length * Math.sin(pi / 5));

        double area = (5 * Math.pow(side, 2)) / 
                      (4 * Math.tan(pi / 5));

        double roundedArea = (double) Math.round(area * 100) / 100;

        System.out.println("The area of the pentagon is " + roundedArea);

    }
}