import java.util.Scanner;

public class _43_AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantity of the chickens on the farm:");
        int chickensQuantity = scanner.nextInt();

        System.out.println("Quantity of the pigs on the farm:");
        int pigsQuantity = scanner.nextInt();

        int legsOnTheFarm = chickensQuantity * 2 + pigsQuantity * 4;

        System.out.println("Legs on the farm: " + legsOnTheFarm);
    }
}
