import java.util.Scanner;

/*
(Print the characters in a string reversely) 
Write a recursive method that displays a string 
reversely on the console using the following header:

    public static void reverseDisplay(String value)

For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.

*/

public class PrintCharactersReversely {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String i = input.nextLine();
    input.close();

    System.out.print("The reversal of " + i + " is ");
    reverseDisplay(i);
  }

  public static void reverseDisplay(String value) {

    if (value.length() > 0) {

        System.out.print(value.charAt(value.length() - 1));
        
        reverseDisplay(value.substring(0, value.length() - 1));
    }
  }
}
