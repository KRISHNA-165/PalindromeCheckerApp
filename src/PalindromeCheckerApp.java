import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "level";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Compare front and rear elements
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Palindrome Checker App");
        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
