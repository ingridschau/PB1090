
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //String input = scanner.nextLine();    // get the entire line after the prompt 
        //String[] numbers = input.split(" "); // split by spaces

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext())
        {
            System.out.println(scanner.nextInt());

            int array = scanner.nextInt();

            System.out.println(array);


        }

        scanner.close();
    }
}