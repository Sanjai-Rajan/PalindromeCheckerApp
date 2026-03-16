import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase6QueueStackPalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates FIFO vs LIFO behavior
 * using Queue and Stack to validate palindrome logic.
 *
 * At this stage, the application:
 * - Enqueues characters into Queue (FIFO)
 * - Pushes characters into Stack (LIFO)
 * - Compares dequeue and pop results
 * - Displays the result
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6QueueStackPalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into Queue and Stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
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
