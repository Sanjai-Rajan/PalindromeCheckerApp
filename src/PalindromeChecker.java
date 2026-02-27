/**
 * ============================================================
 * MAIN CLASS - PalindromeChecker
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This program validates whether a predefined string
 * is a palindrome by comparing characters from both ends.
 *
 * Concepts Used:
 * - String
 * - Loop
 * - if-else condition
 *
 * @version 2.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}