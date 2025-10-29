import java.io.*;

public class WordCountExample {
    public static void main(String[] args) {
        String fileName = "input.txt"; // File to read

        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as delimiter
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Total number of words in " + fileName + ": " + wordCount);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
