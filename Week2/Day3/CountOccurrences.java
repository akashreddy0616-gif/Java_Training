import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // Update frequency count
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Display frequency of each number
        System.out.println("\nFrequency of each element:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " → " + frequencyMap.get(key));
        }

        sc.close();
    }
}
