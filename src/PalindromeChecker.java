/**
 * ============================================================
 * Use Case 3: Palindrome Check Using String Reverse
 * ============================================================
 *
 * Description:
 * This program reverses the string using a loop
 * and compares it with the original string.
 *
 * Concepts Used:
 * - Loop
 * - String concatenation
 * - equals() method
 *
 * @version 3.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "radar";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}