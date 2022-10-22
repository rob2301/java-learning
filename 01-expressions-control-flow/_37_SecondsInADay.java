public class _37_SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int secondsInADay = 60 * 60 * 24;
        int secondsPassed = currentHours * 3600 + currentMinutes * 60 + currentSeconds;
        int secondsLeft = secondsInADay - secondsPassed;

        System.out.println("Remaining seconds of the day: " + secondsLeft);
    }
}
