import java.util.Scanner;

public class _42_MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the distance in miles (like 17.5):");
        double miles = scanner.nextDouble();
        System.out.println("The distance in km: " + miles * 1.609);
    }
}
