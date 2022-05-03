import java.util.*;
import java.lang.Math;

public class AreaOfPentagon {

    public static void main(String[] args) {

        System.out.println("Enter the side: ");

        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));

        //input.close();


       
	}

    public static double area(double side) {

        double area = (5 * (side * side)) / 4 * Math.tan(Math.PI / 5);
        return area;

    }
}