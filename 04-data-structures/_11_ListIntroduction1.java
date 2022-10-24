import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class _11_ListIntroduction1 {
    public static void main(String[] args) {
//        We are going to play with lists. Feel free to use the built-in methods where possible.
//
//        Create an empty list which will contain names (strings)
//        Print out the number of elements in the list
//        Add "William" to the list
//        Print out whether the list is empty or not
//        Add "John" to the list
//        Add "Amanda" to the list
//        Print out the number of elements in the list
//        Print out the 3rd element
//        Iterate through the list and print out each name
//                William
//                John
//                Amanda
//        Iterate through the list and print
//                1. William
//                2. John
//                3. Amanda
//        Remove the 2nd element
//        Iterate through the list in a reversed order and print out each name
//                Amanda
//                William
//        Remove all elements
//        Print out the number of elements in the list
//        The full output of your main method should be the following:
//
//        0
//        false
//        3
//        Amanda
//        William
//        John
//        Amanda
//        1. William
//        2. John
//        3. Amanda
//        Amanda
//        William
//        0

        ArrayList<String> myList = new ArrayList<>();
        System.out.println(myList.size());

        myList.add("William");
        System.out.println(myList.isEmpty());

        myList.addAll(Arrays.asList("John", "Amanda"));
        System.out.println(myList.size());

        System.out.println(myList.get(2));

//        for (String name : myList) {
//            System.out.println(name);
//        }

        myList.forEach(System.out::println);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i + 1) + ". " + myList.get(i));
        }

        myList.remove(1);

        ListIterator<String> listIterator = myList.listIterator(myList.size());

        while (listIterator.hasPrevious()) {
            System.out.println("listIterator: " + listIterator.previous());
        }

        myList.clear();
        System.out.println(myList.size());

    }
}
