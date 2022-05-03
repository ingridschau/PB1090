

/*
(Occurrences of a specified character in a string) 
Write a recursive method that finds the number of occurrences 
of a specified letter in a string using the following method header:

public static int count(String str, char a)

For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
*/

public class Occurences {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = input.nextLine();


    System.out.print("Enter a character: ");
    char ch = input.nextLine().charAt(0);
    input.close();

    int times = count(s, ch);

    System.out.println(ch + " appears " + times + 
      (times > 1 ? " times " : " time ") + "in " + s);
  }

  public static int count(String str, char a) {
      
    int result = 0;
    if (str.length() > 0)
      result = count(str.substring(1), a) +
        ((str.charAt(0) == a) ? 1 : 0);

    return result;
  }
    
}
