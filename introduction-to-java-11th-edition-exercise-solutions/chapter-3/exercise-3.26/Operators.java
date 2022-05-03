import java.util.Scanner;

/*
(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
*/

public class Operators {
    public static void main(String[] args) {

        // Prompt user to enter an integer
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        // Determine whether the number is divisible by 5 and 6 and print result
        System.out.println("Is " + number + " divisible by 4 and 5? " + ((number % 4 == 0) && (number % 5 == 0)));

        System.out.println("Is " + number + " divisible by 4 or 5? " + ((number % 4 == 0) ^ (number % 5 == 0)));

        System.out.println("Is " + number + " divisible by 4 or 5 but not both? " + ((number % 4 == 0) || (number % 5 == 0)));

        // Close input stream
        input.close();
    }
}