// File: UseCase13PalindromeCheckerApp.java
import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Two Pointer Method
    static boolean twoPointerCheck(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack Method
    static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    // Recursive Method
    static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Two Pointer timing
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Stack timing
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Recursive timing
        startTime = System.nanoTime();
        boolean result3 = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + (result1 ? "Palindrome" : "Not Palindrome") +
                " | Time: " + time1 + " ns");
        System.out.println("Stack Method: " + (result2 ? "Palindrome" : "Not Palindrome") +
                " | Time: " + time2 + " ns");
        System.out.println("Recursive Method: " + (result3 ? "Palindrome" : "Not Palindrome") +
                " | Time: " + time3 + " ns");

        scanner.close();
    }
}
