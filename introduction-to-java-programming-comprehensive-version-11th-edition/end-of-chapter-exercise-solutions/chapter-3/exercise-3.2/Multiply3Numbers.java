import java.util.Scanner;
/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
*/

public class Multiply3Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Generate three random integers 
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);

		// Prompt user to enter the sum of three integers
		System.out.println("What is " + digit1 + " + " + digit2 + " + " + digit3 + "?");

		int answer = input.nextInt();

        String answerString;
        if (answer == digit1 + digit2 + digit3) {
            answerString = "correct!";
        } else {
            answerString = "wrong!";
        }
		
		System.out.println(digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " + answerString);

        // Close input stream
        input.close();
	}
}