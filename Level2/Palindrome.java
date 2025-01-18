import java.util.Scanner;

public class Palindrome{
    private String text;

    // Constructor to initialize the text
    public Palindrome(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            // Compare characters from both ends
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a text to check if it's a palindrome:");
        String input = sc.nextLine();

        // Create an instance of PalindromeChecker
        Palindrome checker = new Palindrome(input);

        // Display the result
        checker.displayResult();

        sc.close();
    }
}
