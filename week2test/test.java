
import java.io.*;
import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = 0;
        this.average = 0.0;
    }

    void calculateTotalAndAverage() {
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;
    }
}

public class test {
    public static void main(String[] args) {
        String inputFile = "C:\\Java\\Week2\\Day5\\students_marks.csv";   // Input CSV
        String outputFile = "C:\\Java\\Week2\\Day5\\student_results.csv"; // Output CSV

        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = br.readLine(); // Read header
            String[] headers = line.split(",");

            // Read each student
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();

                int[] marks = new int[parts.length - 1];
                for (int i = 1; i < parts.length; i++) {
                    marks[i - 1] = Integer.parseInt(parts[i].trim());
                }

                Student student = new Student(name, marks);
                student.calculateTotalAndAverage();
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Write output file
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            // Write header
            pw.print("Name");
            for (int i = 1; i < students.get(0).marks.length + 1; i++) {
                pw.print(",Mark" + i);
            }
            pw.println(",Total,Average");

            // Write student data
            for (Student s : students) {
                pw.print(s.name);
                for (int mark : s.marks) {
                    pw.print("," + mark);
                }
                pw.println("," + s.total + "," + String.format("%.2f", s.average));
            }

            System.out.println("Results written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
