/**
 * ============================================================
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * ============================================================
 *
 * Description:
 * Preprocess input by:
 * - Removing spaces
 * - Converting to lowercase
 *
 * Then apply palindrome logic.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @version 10.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}