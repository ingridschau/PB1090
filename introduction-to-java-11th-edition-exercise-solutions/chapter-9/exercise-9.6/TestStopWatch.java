import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {

        int[] randomArray = new int[100000];
        Random random = new Random();

        // Create a StopWatch object
		StopWatch stopWatch = new StopWatch();


		// Invoke the start method in StopWatch class
		stopWatch.start();

		// Sort array
		selectionSort(randomArray);

		// Invoke the stop method in StopWatch class
		stopWatch.stop();

        System.out.println("The execution time of sorting 100,000 " +
        "numbers using selection sort: " + stopWatch.getElapsedTime() +
        " milliseconds");


    }
    //method to sort the array of 100 000 random numbers 
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minimum = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j];
                    minIndex = j;
                }
            }
            // Swap
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minimum;
            }
        }
    }
}