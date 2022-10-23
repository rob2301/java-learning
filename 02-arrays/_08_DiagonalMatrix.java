import java.util.Arrays;
import java.util.Scanner;

public class _08_DiagonalMatrix {
    public static void main(String[] args) {
        // - Create a two-dimensional array dynamically with the following content.
        //   Note that a two-dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two-dimensional array to the output

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number:");
        int number = scanner.nextInt();

        int[][] matrix = new int[number][];

        for (int i = 0; i < number; i++) {
            int[] line = new int[number];

            for (int j = 0; j < number; j++) {
                if (i == j) {
                    line[j] = 1;
                } else {
                    line[j] = 0;
                }
            }

            matrix[i] = line;
        }

        for (int[] element : matrix) {
            System.out.println(Arrays.toString(element));
        }
    }
}
