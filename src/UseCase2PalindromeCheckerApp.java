/**
 * ======================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Goal:
 * Display whether a hardcoded string is a palindrome.
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}