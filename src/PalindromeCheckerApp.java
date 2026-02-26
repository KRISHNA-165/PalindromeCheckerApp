public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("Palindrome Checker App");
            System.out.println("UC3: Palindrome Check Using String Reverse");
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Palindrome Checker App");
            System.out.println("UC3: Palindrome Check Using String Reverse");
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
