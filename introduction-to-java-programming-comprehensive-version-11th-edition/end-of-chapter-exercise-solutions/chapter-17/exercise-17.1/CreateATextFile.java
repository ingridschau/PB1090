import java.io.*;

/* (Create a text file) 
Write a program to create a file named Exercise17_01.txt if it
does not exist. Append new data to it if it already exists. 
Write 150 integers created randomly into the file using text I/O. I
ntegers are separated by a space.
*/


public class CreateATextFile {
    public static void main(String[] args) {
        try {
            // Create a file named Exercise17_01.txt if it does not exist
            File file = new File("Exercise17_01.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            // Append new data to it if it already exists
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write 150 integers created randomly into the file using text I/O
            for (int i = 0; i < 150; i++) {
                bufferedWriter.write(String.valueOf(Math.random() * 100));
                bufferedWriter.write(" ");
            }

            bufferedWriter.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}