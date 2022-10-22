public class _36_Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then your program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000

        double length = 10;
        double height = 20;
        double depth = 30;

        double area = (length * height + length * depth + height * depth) * 2;
        double volume = length * height * depth;

        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);

    }
}
