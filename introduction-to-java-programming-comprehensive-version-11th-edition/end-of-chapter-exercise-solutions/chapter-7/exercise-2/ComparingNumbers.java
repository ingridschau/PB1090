import java.util.Scanner;
/* (Comparing numbers)
Write a program that reads 11 integers, compares each integer with the
11th integer, and displays whether the integers are greater, smaller
or equal to the 11th integer.
*/
public class ComparingNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[11];

		System.out.println("Enter 11 numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int number = numbers[10];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > number) {
				System.out.println("Number " + numbers[i] + " is greater than " + number);
			} else if (numbers[i] < number) {
				System.out.println("Number " + numbers[i] + " is smaller than " + number);
			} else {
				System.out.println("Number " + numbers[i] + " is equal to " + number);
			}
		}

		// Close input stream
		input.close();
	}
}

