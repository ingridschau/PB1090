import java.util.Scanner;

public class PentagonialNumbers {

    public static void main(String[] args) {

       
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int number = input.nextInt();

		System.out.println("The pentagonal number calculated from " + number + " is " + getPentagonalNumber(n));
	}


    public static int getPentagonialNumber(int n) {
        
        double pent = n * (3* n - 1) / 2;

        if (n > 0) 
            return pent;
        else 
            return 0;
        
    }
}

