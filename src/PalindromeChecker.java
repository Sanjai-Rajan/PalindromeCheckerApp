import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =========================================================
 * MAIN CLASS - UseCase7DequePalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque.
 * It compares front and rear elements directly
 * without creating separate reversal structures.
 *
 * At this stage, the application:
 * - Inserts characters into Deque
 * - Removes from front and rear
 * - Compares elements until empty
 * - Displays the result
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7DequePalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
