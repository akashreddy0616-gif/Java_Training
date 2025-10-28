import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter element to search: ");
        int target = sc.nextInt();

        boolean found = false;
        int position = -1;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                position = i;
                break; // stop after finding the element
            }
        }

        if (found)
            System.out.println("\nElement " + target + " found at position " + (position + 1) + ".");
        else
            System.out.println("\nElement " + target + " not found in the array.");

        sc.close();
    }
}
