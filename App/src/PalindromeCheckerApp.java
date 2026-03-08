import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {
     public static void main(String[] args) {

         String text = "madam";

         Stack<Character> stack = new Stack<>();
         Queue<Character> queue = new LinkedList<>();

         // Push to stack and enqueue to queue
         for (int i = 0; i < text.length(); i++) {
             char ch = text.charAt(i);
             stack.push(ch);      // LIFO
             queue.add(ch);       // FIFO
         }

         boolean isPalindrome = true;

         // Compare dequeue (FIFO) and pop (LIFO)
         while (!stack.isEmpty() && !queue.isEmpty()) {
             if (stack.pop() != queue.remove()) {
                 isPalindrome = false;
                 break;
             }
         }

         // Print result
         if (isPalindrome) {
             System.out.println("The string \"" + text + "\" is a Palindrome.");
         } else {
             System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
         }
     }
}
