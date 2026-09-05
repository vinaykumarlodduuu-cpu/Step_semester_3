
package Week1;

public class MovieReviewWordLength {

    static void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            }
            else if (length >= 5 && length <= 8) {
                mediumWords++;
            }
            else {
                longWords++;
            }
        }

        System.out.println("Short Words (1-4): " + shortWords);
        System.out.println("Medium Words (5-8): " + mediumWords);
        System.out.println("Long Words (9+): " + longWords);
    }

    public static void main(String[] args) {

        String review = "The movie was absolutely fantastic and entertaining";

        classifyWordLengths(review);
    }
}