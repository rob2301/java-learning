import java.util.Scanner;

public class _607_DrawPyramid {
    public static void main(String[] args) {
        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            String line = "";

            for (int j = number - i; j >= 0; j--) {
                line += " ";
            }

            for (int k = 2; k <= i * 2; k++) {
                line += "*";
            }

            System.out.println(line);
        }
    }
}
