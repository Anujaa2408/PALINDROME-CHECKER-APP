// Service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}

// Main class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}