import java.util.HashMap;

public class _12_MapIntroduction1 {
    public static void main(String[] args) {
//        # Map introduction 1
//
//        We are going to play with maps. Feel free to use the built-in methods where
//        possible.
//
//                - Create an empty map where the keys are integers and the values are characters
//                - Print out whether the map is empty or not
//                - Add the following key-value pairs to the map
//                  |  Key | Value |
//                  | :--- | :---- |
//                  | 97   | a     |
//                  | 98   | b     |
//                  | 99   | c     |
//                  | 65   | A     |
//                  | 66   | B     |
//                  | 67   | C     |
//                - Print all the keys
//                - Print all the values
//                - Add value D with the key 68
//                - Print how many key-value pairs are in the map
//                - Print the value that is associated with key 99
//                - Remove the key-value pair with key 97 and print the associated value
//                - Print whether there is an associated value with key 100 or not
//                - Remove all the key-value pairs
//                - Print how many key-value pairs are in the map
//
//        The full output of your `main` method should be the following:
//        true
//        [97, 65, 98, 66, 99, 67]
//        [a, A, b, B, c, C]
//        7
//        c
//        false
//        0

        HashMap<Integer, String> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty());

        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");

        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

        myMap.put(68, "D");

        System.out.println(myMap.size());

        System.out.println(myMap.get(99));

        System.out.println(myMap.containsKey(100));

        myMap.clear();

        System.out.println(myMap.size());
    }
}
