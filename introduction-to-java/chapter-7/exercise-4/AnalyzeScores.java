import java.util.Scanner;

class AnalyzeScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] scores = new double[100];

        int count = 0;
        double sum = 0;
        System.out.println("Enter a new score (enter a negative number"
                + " to complete program): ");

        for (int i = 0; i < 100; i++) {
            double score = input.nextDouble();
            if (score < 0) break;
            scores[i] = score;
            count++;
            sum += scores[i];

        }

        double average = sum / count;
        int aboveOrEqual = 0;

        for (int i = 0; i <= count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            }
        }

        System.out.println("Count is: " + count);
        System.out.printf("The average is %1.2f \n", average);
        System.out.println("Number of scores above or equal to average is: "
                + aboveOrEqual);
        System.out.println("Number of scores below the average is:"
                + " " + (count - aboveOrEqual));
    }

}