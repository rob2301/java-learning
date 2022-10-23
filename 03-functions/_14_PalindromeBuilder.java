import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _14_PalindromeBuilder {
    public static void main(String[] args) {
        // Create a function named createPalindrome() following your current language's style guide.
        // It should take a string, create a palindrome from it and then return it.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a word:");
        String word = scanner.nextLine();

        System.out.println(createPalindrome(word));
    }

    public static String createPalindrome(String word) {
        String palindrome = word;

        for (int i = 0; i < word.length(); i++) {
            palindrome += word.charAt(word.length() - i - 1);
        }

        return palindrome;
    }
}
