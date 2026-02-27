import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 * ============================================================
 *
 * Description:
 * Uses Deque (Double Ended Queue)
 * to compare first and last characters directly.
 *
 * Removes from front and rear until empty.
 *
 * @version 7.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}