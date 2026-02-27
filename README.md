/**
* ============================================================
* MAIN CLASS - PalindromeChecker
* ============================================================
*
* Use Case 2: Hardcoded Palindrome Validation
*
* Description:
* This class demonstrates basic palindrome validation
* using a hardcoded string value.
*
* The application:
* - Stores a predefined string
* - Compares characters from both ends
* - Determines whether the string is a palindrome
* - Displays the result on the console
*
* @author Developer
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