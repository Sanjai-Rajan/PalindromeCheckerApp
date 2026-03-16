import java.util.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase5StackPalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome by pushing
 * characters into a stack and popping them to
 * compare with the original string.
 *
 * At this stage, the application:
 * - Pushes characters into stack
 * - Pops characters in reverse order
 * - Compares with original string
 * - Displays the result
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5StackPalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
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
