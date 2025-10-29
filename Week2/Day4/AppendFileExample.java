import java.io.*;

public class AppendFileExample {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try {
            // 'true' in FileWriter constructor enables append mode
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            // Data to append
            writer.write("Appending this line to the file.\n");
            writer.write("Another line added!\n");

            // Close the writer
            writer.close();

            System.out.println("Data appended successfully to " + fileName);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
