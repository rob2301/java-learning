import java.util.Scanner;

public class _05_Factorial {
    public static void main(String[] args) {
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scanner.nextInt();
        System.out.println(calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        if (number == 1) return 1;
        return number * (calculateFactorial(number - 1));
    }

}
