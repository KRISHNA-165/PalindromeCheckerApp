import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        // Convert string to linked list
        static Node buildList(String str) {
            Node head = null, tail = null;

            for (int i = 0; i < str.length(); i++) {
                Node newNode = new Node(str.charAt(i));
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }

        // Reverse linked list
        static Node reverse(Node head) {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }

        // Palindrome check
        static boolean isPalindrome(Node head) {
            if (head == null || head.next == null)
                return true;

            // Find middle using fast & slow pointer
            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node secondHalfStart = reverse(slow.next);

            // Compare first and second half
            Node firstHalf = head;
            Node secondHalf = secondHalfStart;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Node head = buildList(input);

            if (isPalindrome(head)) {
                System.out.println("Is Palindrome? : true");
            } else {
                System.out.println("Is Palindrome? : false");
            }

            scanner.close();
    }
}
