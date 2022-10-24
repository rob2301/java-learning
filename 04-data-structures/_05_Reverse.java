public class _05_Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
    }

//    Solution 1

//    public static String reverse(String text) {
//        StringBuilder result = new StringBuilder();
//
//        for (String character : text.split("")) {
//            result.insert(0, character);
//        }
//
//        return result.toString();
//    }

//    Solution 2

//    public static String reverse(String text) {
//        String result = "";
//
//        for (int i = 0; i < text.length(); i++) {
//            result += text.charAt(text.length() - 1 - i);
//        }
//
//        return result;
//    }

//    Solution 3

        public static String reverse(String text) {
            StringBuilder result = new StringBuilder(text);

            return result.reverse().toString();
    }
}
