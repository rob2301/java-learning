import java.util.Scanner;

public class _44_AvarageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide five integers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();

        int sum = one + two + three + four + five;
        int average = sum / 5;

        System.out.println("Sum: "  + sum + ", Average: " + average);

    }


}
