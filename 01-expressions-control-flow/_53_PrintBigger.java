import java.util.Scanner;

public class _53_PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide two integers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
