import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int grade = 0;

        
        while (grade != -1) {
            System.out.println("Enter your score: ");
            grade = input.nextInt();

            if (grade >= 60) {
                System.out.println("You pass the exam.");
            }
            else {
                System.out.println("You don't pass the exam.");
            }

        } System.out.println("No numbers are entered except 0 ");

        input.close();
    }
}