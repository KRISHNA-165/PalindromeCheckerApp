public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Palindrome Checker App");
            System.out.println("UC2: Print a Hardcoded Palindrome Result");
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Palindrome Checker App");
            System.out.println("UC2: Print a Hardcoded Palindrome Result");
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
