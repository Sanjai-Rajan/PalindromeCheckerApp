import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ============================================================
 * Use Case 6: Queue + Stack Based Palindrome Check
 * ============================================================
 *
 * Description:
 * Demonstrates palindrome validation using:
 * - Queue (FIFO)
 * - Stack (LIFO)
 *
 * Characters are inserted into both structures.
 * Then dequeue (Queue) and pop (Stack) values are compared.
 *
 * If all characters match → palindrome.
 *
 * @version 6.0
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}