import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Akash");
        names.add("John");
        names.add("Riya");
        names.add("Sam");
        names.add("David");

        System.out.println("Original List: " + names);

        // Remove an element
        names.remove("Sam");
        System.out.println("After removing 'Sam': " + names);

        // Filter: Keep only names starting with 'A'
        ArrayList<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        }
        System.out.println("Filtered (starts with 'A'): " + filteredNames);

        // Iterate using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
