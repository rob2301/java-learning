public class _02_Greeting {
    public static void main(String[] args) {
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet()` that greets its input parameter
        //     - It prints a greeting message e.g. `Greetings dear Green Fox`
        // - Greet `al`

        String al = "Green Fox";
        System.out.println(greet(al));
    }

    public static String greet(String name) {
        return "Greetings dear " + name;
    }
}
