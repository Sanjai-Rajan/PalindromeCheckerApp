import java.util.LinkedList;

/**
 * ============================================================
 * Use Case 8: Linked List Based Palindrome Checker
 * ============================================================
 *
 * Description:
 * Uses LinkedList to store characters.
 * Compares first and last elements using:
 * - removeFirst()
 * - removeLast()
 *
 * @version 8.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}