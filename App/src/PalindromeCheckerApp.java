import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromePerformanceComparison {

    // Method 1: Reverse String using loop
    public static boolean reverseStringMethod(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equals(reversed);
    }

    // Method 2: Stack approach
    public static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque approach
    public static boolean dequeMethod(String text) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "madam";

        // Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = reverseStringMethod(text);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(text);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(text);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Reverse String Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}