import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _13_Anagram {
    public static void main(String[] args) {
        // Create a function named isAnagram() following your current language's style guide.
        // It should take two strings and return a boolean value depending on whether it's an anagram or not.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the first word:");
        String first = scanner.nextLine();

        System.out.println("Please provide the second word:");
        String second = scanner.nextLine();

        System.out.println("Are these anagrams? " + isAnagram(first, second));
    }

    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) return false;

        String[] firstArray =  first.split("");
        String[] secondArray =  second.split("");

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
