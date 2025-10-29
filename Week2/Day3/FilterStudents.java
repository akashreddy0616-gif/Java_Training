import java.util.HashMap;
import java.util.Scanner;

public class FilterStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline
            studentMarks.put(name, marks);
        }

        // Display all students
        System.out.println("\nAll Students and Marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " → " + studentMarks.get(name));
        }

        // Filter and display students with marks > 50
        System.out.println("\nStudents with marks > 50:");
        for (String name : studentMarks.keySet()) {
            if (studentMarks.get(name) > 50) {
                System.out.println(name + " → " + studentMarks.get(name));
            }
        }

        sc.close();
    }
}
