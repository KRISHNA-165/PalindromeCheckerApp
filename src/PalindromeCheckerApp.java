public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Convert string to character array
        char[] charArray = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Palindrome Checker App");
        System.out.println("UC4: Character Array Based Palindrome Check");

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
