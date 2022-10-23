import java.util.Arrays;

public class _07_Colors {
    public static void main(String[] args) {
        // - Create a two-dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[][] colors = new String[3][];

        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        colors[0] = green;
        colors[1] = red;
        colors[2] = pink;

        for (String[] element : colors) {
            System.out.println(Arrays.toString(element));
        }
    }
}
