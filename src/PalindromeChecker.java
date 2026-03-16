import java.util.Stack;

/**
 * ============================================================
 * Use Case 5: Stack Based Palindrome Checker
 * ============================================================
 *
 * Description:
 * Uses Stack (LIFO principle) to reverse characters
 * and validate palindrome.
 *
 * Concepts Used:
 * - Stack
 * - Push
 * - Pop
 *
 * @version 5.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}