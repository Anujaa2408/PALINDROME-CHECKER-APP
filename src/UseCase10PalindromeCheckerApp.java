public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "Never Odd Or Even";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("The given string is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}