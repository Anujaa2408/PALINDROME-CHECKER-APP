public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Reverse string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare strings
        if (word.equals(reversed)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}