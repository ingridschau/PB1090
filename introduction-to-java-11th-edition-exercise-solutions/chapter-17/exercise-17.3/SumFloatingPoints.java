import java.io.*;

/* (Sum all the floating points in a binary data file) 
Suppose a binary data file named Exercise17_03.dat has 
been created and its data are created using writeDouble(double) 
in DataOutputStream. The file contains an unspecified number of 
floating points. Write a program to find the sum of the floating points.
*/

class SumFloatingPoints {
    public static void main(String[] args) throws IOException {
		int sum = 0; // Sum of the integers

		try ( // Create an data input stream for file Exercise17_03.dat
			DataInputStream input = 
				new DataInputStream(new FileInputStream("Exercise17_03.dat")); 
		) {
			// Read and sum the integers from the file
			while (true)
				sum += input.readInt();
		}
		catch (EOFException ex) { // Detect end of file
			System.out.println("Sum of the integers is: " + sum);
		}
	}
}
