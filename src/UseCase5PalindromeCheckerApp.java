import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        System.out.println("Palindrome Checker App");
        System.out.println("UC5: Stack-Based Palindrome Checker");

        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
