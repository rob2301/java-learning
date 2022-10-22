import java.util.Scanner;

public class _606_DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            StringBuilder stars = new StringBuilder();

            for (int j = 1; j <= i; j++) {
                stars.append("*");
            }

            System.out.println(stars);
        }
    }
}
