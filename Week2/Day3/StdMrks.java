import java.util.HashMap;
import java.util.Scanner;

public class StdMrks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> stdMrks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Add students and marks using put()
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline
            stdMrks.put(name, marks);
        }

        // Display all entries
        System.out.println("\nAll Student Marks:");
        for (String name : stdMrks.keySet()) {
            System.out.println(name + " → " + stdMrks.get(name));
        }

        // Check if a student exists
        System.out.print("\nEnter a student name to search: ");
        String searchName = sc.nextLine();
        if (stdMrks.containsKey(searchName)) {
            System.out.println(searchName + " found! Marks: " + stdMrks.get(searchName));
        } else {
            System.out.println(searchName + " not found in the records.");
        }

        sc.close();
    }
}
