/**
 * ============================================================
 * Use Case 4: Character Array Based Palindrome Check
 * ============================================================
 *
 * Description:
 * Converts string into char array
 * and applies two-pointer technique.
 *
 * Concepts Used:
 * - char[]
 * - Two pointer approach
 *
 * @version 4.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "level";
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}