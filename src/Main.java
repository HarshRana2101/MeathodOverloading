public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("harsh", 500);
        System.out.println("New Score " + newScore);
        calculateScore();
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score);
        return score = 1000;
    }
    private static int calculateScore( int score) {
        System.out.println("Unnamed Player Scored " + score + " points");
        return score = 1000;
    }
    private static int calculateScore( ) {
        System.out.println("no player name,no player score");
        return 0;
    }
}
