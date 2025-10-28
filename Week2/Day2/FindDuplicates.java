import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements (with duplicates)
        names.add("Akash");
        names.add("Riya");
        names.add("John");
        names.add("Riya");
        names.add("David");
        names.add("Akash");

        System.out.println("Original List: " + names);

        // Use a HashSet to detect duplicates
        HashSet<String> unique = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!unique.add(name)) {  // if element already exists
                duplicates.add(name);
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }
}
