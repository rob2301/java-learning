import java.util.Arrays;

public class _13_Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};

        // Solution 1

//        int[] reversed = new int[numbers.length];
//
//        for (int i = 1; i <= numbers.length; i++) {
//            reversed[i - 1] = numbers[numbers.length - i];
//        }
//
//        System.out.println(Arrays.toString(reversed));

        // Solution 2

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(numbers));

    }
}
