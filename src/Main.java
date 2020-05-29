public class Main {
    /*meathod overloading means same meathod with same name
    but with differnt parameters*/

    public static void main(String[] args) {
        /*int newScore = calculateScore("harsh", 500);
        System.out.println("New Score " + newScore);
        calculateScore();*/
        double centemeters = calculateFeetAndInchestoCentimeters(7, 5);
        if (centemeters < 0) {
            System.out.println("invalid parametrs");
        }

        calculateFeetAndInchestoCentimeters(156);
    }

   /* private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score);
        return score = 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " points");
        return score = 1000;
    }

    private static int calculateScore() {
        System.out.println("no player name,no player score");
        return 0;
    }
*/

    public static double calculateFeetAndInchestoCentimeters(double feet, double inches) {
        //validation
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches=" + centimeters + "cms");
        return centimeters;
    }

    public static double calculateFeetAndInchestoCentimeters(double inches) {
        if (inches < 0) {
            return -1;//validation
        }
        double feet = (int) inches / 12;
        double remaingInches = (int) inches % 12;
        System.out.println(inches + "inches =" + feet + "feet and" + remaingInches + "remaining inches");
        return calculateFeetAndInchestoCentimeters(feet, remaingInches);
    }
}
