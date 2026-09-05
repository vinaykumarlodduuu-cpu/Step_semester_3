
package Week1;

public class TrafficSignalStreak {

    static void findLongestStreak(String signals) {

        if (signals.length() == 0) {
            System.out.println("No Signals");
            return;
        }

        int currentStreak = 1;
        int longestStreak = 1;

        char longestSignal = signals.charAt(0);

        for (int i = 1; i < signals.length(); i++) {

            if (signals.charAt(i) == signals.charAt(i - 1)) {

                currentStreak++;

            } else {

                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {

                longestStreak = currentStreak;
                longestSignal = signals.charAt(i);
            }
        }

        System.out.println("Longest Signal: " + longestSignal);
        System.out.println("Longest Streak: " + longestStreak);
    }

    public static void main(String[] args) {

        String signals = "RRRGGGGYYRR";

        findLongestStreak(signals);
    }
}