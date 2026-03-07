import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String word) {

        Stack<Character> stack = new Stack<>();

        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Method
    public static boolean dequeMethod(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse Method
        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        stackMethod(word);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        dequeMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method Time: " + (end3 - start3) + " ns");
    }
}