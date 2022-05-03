import java.util.Scanner;

public class ArrayAverage {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] values = new double[10]; // Array of length 10

		// Prompt the user to enter ten double values
		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

		// Display the average value
		System.out.println("The average value: " + average(values));
        input.close();
	}

	/* Overloaded method average accepts an integer array and returns its average */
	public static int average(int[] array) {
		int average = 0; 
		for (int i: array)
			average += i;	// Add indexed value to average
		return average / array.length;
	}   

	/* Overloaded method average accepts an double array and returns its average */
	public static double average(double[] array) {
		double average = 0; 
		for (double i: array)
			average += i; // Add indexed value to average
		return average / array.length;
	}
}