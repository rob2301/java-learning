import java.util.ArrayList;

public class _12_Unique {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static ArrayList<Integer> findUniqueItems(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int element : array) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
