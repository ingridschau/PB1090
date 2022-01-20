import java.util.Scanner;

public class FormatInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    	System.out.print("Enter an integer: ");

    	int number = input.nextInt();

    	System.out.print("Enter a width: ");

    	int width = input.nextInt();

    	System.out.println("The formatted number: " + format(number, width));
	}

	public static String format(int number, int width) {
		String result = number + "";

		for (int i = 0; i < width - length(number); i++)
      		result = "0" + result;

    return result;
	}

	public static int length(int number) {
		int size = 0;
		while (number > 0) {
			size += 1;
			number = number / 10;
		}

    	return size;
	}

}