/**
 * ============================================================
 * MAIN CLASS - PalindromeChecker
 * ============================================================
 *
<<<<<<< HEAD
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
=======
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * @author Developer
 * @version 1.0
>>>>>>> de34ebd62aafa1ab78e780af15b6cc5db04e9011
 */

public class PalindromeChecker {

<<<<<<< HEAD
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
=======
    /**
     * Application entry point.
     * This is the first method executed by the JVM.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

>>>>>>> de34ebd62aafa1ab78e780af15b6cc5db04e9011
    }
}