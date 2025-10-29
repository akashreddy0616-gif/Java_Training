import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IterateMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline
            studentMarks.put(name, marks);
        }

        // Iterating using keySet()
        System.out.println("\nIterating using keySet():");
        for (String name : studentMarks.keySet()) {
            System.out.println("Name: " + name + ", Marks: " + studentMarks.get(name));
        }

        // Iterating using entrySet()
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }

        sc.close();
    }
}
