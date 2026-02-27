/**
 * ============================================================
 * Use Case 9: Recursive Palindrome Checker
 * ============================================================
 *
 * Description:
 * Uses recursion to compare characters
 * from outer positions moving inward.
 *
 * Base condition:
 * - start >= end → true
 *
 * @version 9.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "radar";

        boolean result = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }

    private static boolean checkPalindrome(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return checkPalindrome(s, start + 1, end - 1);
    }
}