package Week5;

import java.util.Arrays;

public class FantasyLeagueAutoDraftRankingEngine {

    static class Player implements Comparable<Player> {

        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name,
                      int matchesPlayed,
                      double battingAverage,
                      boolean injured) {

            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        static boolean isDraftable(int matchesPlayed) {

            return matchesPlayed >= 10;
        }

        static boolean isDraftable(int matchesPlayed,
                                   boolean injured) {

            return matchesPlayed >= 5 && !injured;
        }

        @Override
        public int compareTo(Player other) {

            return Double.compare(
                    other.battingAverage,
                    this.battingAverage
            );
        }
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        for (Player player : players) {

            if (Player.isDraftable(player.matchesPlayed)
                    || Player.isDraftable(
                    player.matchesPlayed,
                    player.injured)) {

                draftable[count] = player;
                count++;
            }
        }

        Player[] finalDraftable = Arrays.copyOf(draftable, count);

        Arrays.sort(finalDraftable);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < finalDraftable.length; i++) {

            result.append(i + 1)
                    .append(". ")
                    .append(finalDraftable[i].name);

            if (i < finalDraftable.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Player[] players = {

                new Player(
                        "Virat",
                        15,
                        48.0,
                        false
                ),

                new Player(
                        "Rahul",
                        7,
                        55.0,
                        false
                ),

                new Player(
                        "Sameer",
                        3,
                        60.0,
                        false
                ),

                new Player(
                        "Dev",
                        12,
                        20.0,
                        true
                )
        };

        System.out.println(draftAndRank(players));
    }
}