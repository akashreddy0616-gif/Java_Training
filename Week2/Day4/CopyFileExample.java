import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        String sourceFile = "input.txt";   // File to read from
        String destFile = "output.txt";    // File to write to

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);    // Write the line to destination file
                writer.newLine();      // Add new line
            }

            // Close the streams
            reader.close();
            writer.close();

            System.out.println("Content copied from " + sourceFile + " to " + destFile + " successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
