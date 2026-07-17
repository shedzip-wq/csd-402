/*
	* Author: Sheridan Dela Cruz
	* Date: July 15, 2026
	* Module 9.2
	* Desciption: Creates a file named data.file, writes or appends 10 random integers, then reads and 
	* displays the file’s contents
 */
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        File file = new File("data.file");

        try {
            // Create file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // Write or append 10 random numbers
            FileWriter writer = new FileWriter(file, true); // true = append mode
            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // random number 0–99
                writer.write(number + " ");
            }

            writer.close();
            System.out.println("10 random numbers written to file.");

            // Reopen file and read contents
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of data.file:");

            while (reader.hasNext()) {
                System.out.print(reader.nextInt() + " ");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
