import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class _15_PersonalFinance {
    public static void main(String[] args) {
//        # Personal finance
//
//        We are going to represent our expenses in a list containing integers.
//
//        - Create a list with the following items:
//            - 500, 1000, 1250, 175, 800 and 120
//        - Create an application which prints out the answers to the following questions:
//            - How much did we spend?
//            - Which was our greatest expense?
//            - Which was our cheapest spending?
//            - What was the average amount of our spendings? (print this as a float value)
//
//        The full output of your `main` method should be the following:
//        3845
//        1250
//        120
//        640.8333

        ArrayList<Integer> finance = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        System.out.println(sum(finance));
        System.out.println(max(finance));
        System.out.println(min(finance));
        System.out.println(average(finance));
    }

    public static int sum(ArrayList<Integer> finance) {
        //        return finance.stream().reduce(Integer::sum).get();
        int sum = 0;

        for (Integer element : finance) {
            sum += element;
        }

        return sum;

    }

    public static int max(ArrayList<Integer> finance) {
        return finance.stream().max(Integer::compare).get();
    }

    public static int min(ArrayList<Integer> finance) {
        return finance.stream().min(Integer::compare).get();
    }

    public static double average(ArrayList<Integer> finance) {
        return (double) sum(finance) / finance.size();
    }
}
