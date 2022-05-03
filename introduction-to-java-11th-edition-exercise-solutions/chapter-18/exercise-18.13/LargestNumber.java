import java.util.Scanner;

/*
(Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.
*/

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 8 integers: ");
    
    int[] list = new int[8];
    for (int i = 0; i < list.length; i++)
      list[i] = input.nextInt();
    
    input.close();
    System.out.println("The largest element is " + largest(list));
  }

  public static int largest(int[] list) {
    return largest(list, list.length - 1);
  }

  public static int largest(int[] list, int high) {
    if (high == 0) {
      return list[0];
    }
    else {
      return Math.max(largest(list, high - 1), list[high]);
    }
  }
}
