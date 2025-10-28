import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Riya");
        names.add("Akash");
        names.add("David");
        names.add("John");
        names.add("Sam");

        System.out.println("Original List: " + names);

        // Sort the ArrayList in ascending order
        Collections.sort(names);
        System.out.println("Sorted List (Ascending): " + names);

        // Sort the ArrayList in descending order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + names);
    }
}
