public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "madam";

        if (isPalindrome(text, 0, text.length() - 1)) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}