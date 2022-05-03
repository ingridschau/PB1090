import java.io.*;
/*(Store objects and arrays in a file) Write a program that stores an array of the six
int values 1, 2, 3, 4,5, and 6, a Date object for the current time, and the double
value 10.5 into the file named Exercise17_05.dat. 
*/

public class StoreObjectsAndArrays {
    public static void main(String[] args) throws IOException {
		// Create an array of integers
		int[] numbers = {1, 2, 3, 4, 5};

		try ( // Create an output stream for file Exercise17_05.dat
			ObjectOutputStream output = new ObjectOutputStream(new
				FileOutputStream("Exercise17_05.dat"));
		) {
			// Write an array, double value, and Date object to the file
			output.writeObject(numbers);
			output.writeDouble(5.5);
			output.writeObject(new java.util.Date());
		}
	}
    
}
