import java.util.Arrays;

public class _06_PrintAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`

        int[] numbers = {4, 5, 6, 7};

        // Solution 1
        System.out.println(Arrays.toString(numbers));

        // Solution 2
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
