import java.io.*;
/*
(Create a binary data file) Write a program to create a file named
Exercise17_02.dat if it does not exist. Append new data to it if it already exists.
Write 150 integers created randomly into the file using binary I/O.
*/

class CreateBinaryDataFile {
    public static void main(String[] args){

        try (
			// Create an output stream to the file
			// Append new data if file already exists
			FileOutputStream output = 
				new FileOutputStream("Exercise17_02.dat", true);
		) {
			// Output 150 integers created randomly into the file
			for (int i = 0; i < 150; i++)
				output.write((int)(1 + Math.random() * 100));
		}
	}

}
