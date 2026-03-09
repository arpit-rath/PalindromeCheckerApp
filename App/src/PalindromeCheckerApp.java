import java.util.Stack;

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Compare with popped characters
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(text)) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}