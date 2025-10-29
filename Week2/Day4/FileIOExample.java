import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            File file = new File(inputFile);

            // If input.txt doesn't exist, create it and add some sample content
            if (!file.exists()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("Hello\n");
                writer.write("Welcome to Java File I/O\n");
                writer.close();
                System.out.println(inputFile + " created with sample content.");
            }

            // Reading from the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line); // Print the line
                writer.write(line);                  // Write the line to output file
                writer.newLine();                    // Move to next line
            }

            // Closing resources
            reader.close();
            writer.close();

            System.out.println("File copy completed successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
