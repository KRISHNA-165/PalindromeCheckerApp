// File: UseCase10PalindromeCheckerApp.java
import java.util.Scanner;

class PalindromeCheckerApp {

    // Method to check palindrome ignoring case and spaces
    static boolean isPalindrome(String str) {
        // Step 1: Normalize string (remove spaces & convert to lowercase)
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Step 2: Apply palindrome logic
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}
