package JVM_TTN_Assignments.Self_Study_Assignment_2.solution_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution_3 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Solution_3 <filename> <word>");
            return;
        }

        String filename = args[0];
        String targetWord = args[1];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split line into words using spaces and punctuation
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


