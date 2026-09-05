package Week1;

public class TypingSpeedAccuracy {

    static void checkAccuracy(String original, String typed) {

        int matchedCharacters = 0;
        int length = Math.min(original.length(), typed.length());

        int firstMismatch = -1;

        for (int i = 0; i < length; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }

        int accuracy = (matchedCharacters * 100) / original.length();

        System.out.println("Matched Characters: " + matchedCharacters);
        System.out.println("Accuracy: " + accuracy + "%");

        if (firstMismatch != -1) {
            System.out.println("First Mismatch Position: "
                    + firstMismatch);
        } else if (original.length() != typed.length()) {
            System.out.println("First Mismatch Position: "
                    + length);
        } else {
            System.out.println("No Mismatch Found");
        }
    }

    public static void main(String[] args) {

        String original = "programming";
        String typed = "programing";

        checkAccuracy(original, typed);
    }
}