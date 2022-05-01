import java.util.Scanner;

/**
 * 3.14 (Game: heads or tails) Write a program that lets the user guess whether
 * the flip of a coin results in heads or tails. The program randomly generates
 * an integer 0 or 1, which represents head or tail. The program prompts the
 * user to enter a guess and reports whether the guess is correct or incorrect.
 */

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random integer 0 or 1
        int flip = (int)(Math.random() * 2);

        // Prompt user to enter a guess
        System.out.println("Guess whether the flip of a coin results in heads or tails.");
        System.out.print("Enter heads or tails: ");

        String guess = input.next();

        String result;
        if (guess.equals("heads") && flip == 0) {
            result = "correct!";
        } else if (guess.equals("tails") && flip == 1) {
            result = "correct!";
        } else {
            result = "wrong!";
        }

        System.out.println("The flip of a coin results in " + guess + " and the guess is " + result);

        // Close input stream
        input.close();
    }

}