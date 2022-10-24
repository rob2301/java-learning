import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _18_ShoppingList2 {
    public static HashMap<String, Double> priceList = new HashMap<>();
    public static HashMap<String, Integer> bobList = new HashMap<>();
    public static HashMap<String, Integer> aliceList = new HashMap<>();


    public static void main(String[] args) {
//        # Shopping list 2
//
//        - Represent the following products with their prices:
//                  | Product         | Price  |
//                  | :-------------- | :----- |
//                  | Milk            | 1.07   |
//                  | Rice            | 1.59   |
//                  | Eggs            | 3.14   |
//                  | Cheese          | 12.60  |
//                  | Chicken Breasts | 9.40   |
//                  | Apples          | 2.31   |
//                  | Tomato          | 2.58   |
//                  | Potato          | 1.75   |
//                  | Onion           | 1.10   |
//
//        - Represent Bob's shopping list:
//                  | Product         | Amount |
//                  | --------------- | ------ |
//                  | Milk            | 3      |
//                  | Rice            | 2      |
//                  | Eggs            | 2      |
//                  | Cheese          | 1      |
//                  | Chicken Breasts | 4      |
//                  | Apples          | 1      |
//                  | Tomato          | 2      |
//                  | Potato          | 1      |
//
//        - Represent Alice's shopping list:
//                  | Product         | Amount |
//                  | --------------- | ------ |
//                  | Rice            | 1      |
//                  | Eggs            | 5      |
//                  | Chicken Breasts | 2      |
//                  | Apples          | 1      |
//                  | Tomato          | 10     |
//
//        - Create an application which prints out the answers to the following questions:
//                - How much does Bob pay?
//                - How much does Alice pay?
//                - Who buys more Rice?
//                - Who buys more Potato?
//                - Who buys more Ham?
//                - Who buys more Apples?
//                - Who buys more of different products?
//                - Who buys more items? (more pieces)
//
//        The full output of your `main` method should be the following:
//                72.09
//                64.2
//                Bob
//                Bob
//                no one
//                no one
//                Bob
//                Alice

        priceList.put("Milk", 1.07);
        priceList.put("Rice", 1.59);
        priceList.put("Eggs", 3.14);
        priceList.put("Cheese", 12.60);
        priceList.put("Chicken Breasts", 9.40);
        priceList.put("Apples", 2.31);
        priceList.put("Tomato", 2.58);
        priceList.put("Potato", 1.75);
        priceList.put("Onion", 1.10);

        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Eggs", 2);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breasts", 4);
        bobList.put("Apples", 1);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);

        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);

        System.out.println(sumPrice(bobList));
        System.out.println(sumPrice(aliceList));
        System.out.println(whoBuysMoreOf("Bob", bobList, "Alice", aliceList, "Rice"));
        System.out.println(whoBuysMoreOf("Bob", bobList, "Alice", aliceList, "Potato"));
        System.out.println(whoBuysMoreOf("Bob", bobList, "Alice", aliceList, "Ham"));
        System.out.println(whoBuysMoreOf("Bob", bobList, "Alice", aliceList, "Apple"));
        System.out.println(whoBuysMoreDifferentProducts("Bob", bobList, "Alice", aliceList));
        System.out.println(whoBuysMoreItems("Bob", bobList, "Alice", aliceList));}

    public static double sumPrice(HashMap<String , Integer> shoppingList) {
        double priceSum = 0;

        for (String key : shoppingList.keySet()) {
            priceSum += shoppingList.get(key) * priceList.get(key);
        }

        return priceSum;
    }

    public static String whoBuysMoreOf(String name1,  HashMap<String, Integer> shoppingList1,
                                       String name2, HashMap<String, Integer> shoppingList2,
                                       String product) {

        if (shoppingList1.getOrDefault(product, 0) ==
                shoppingList2.getOrDefault(product, 0)) return "no one";

        return shoppingList1.getOrDefault(product, 0) >
                shoppingList2.getOrDefault(product, 0) ? name1 : name2;

    }

    public static String whoBuysMoreDifferentProducts(String name1,  HashMap<String, Integer> shoppingList1,
                                                      String name2, HashMap<String, Integer> shoppingList2) {
//        int first = shoppingList1.values().stream().reduce(Integer::sum).get();

        return shoppingList1.keySet().toArray().length >
                shoppingList2.keySet().toArray().length ? name1 : name2;
    }

    public static String whoBuysMoreItems(String name1,  HashMap<String, Integer> shoppingList1,
                                                      String name2, HashMap<String, Integer> shoppingList2) {
//        int first = shoppingList1.values().stream().reduce(Integer::sum).get();

        return shoppingList1.values().stream().reduce(Integer::sum).get() >
                shoppingList2.values().stream().reduce(Integer::sum).get() ? name1 : name2;
    }
}
