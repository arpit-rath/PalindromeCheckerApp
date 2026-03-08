public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Reverse the string
        String reversed = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

            // Check palindrome
        if(text.equals(reversed)) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
