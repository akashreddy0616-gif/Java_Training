import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i)); // Convert to lowercase for simplicity
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
        scanner.close();
    }
}
