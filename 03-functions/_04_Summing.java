import java.util.Scanner;

public class _04_Summing {
    public static void main(String[] args) {
        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }

    public static int sum(int number) {
        if (number == 0) return 0;
        return number + sum(number - 1);
    }
}
