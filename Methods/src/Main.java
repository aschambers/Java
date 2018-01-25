public class Main {
    public static void main(String[] args) {
        // two ways to use methods
        calculateScore(true, 800, 5, 100);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 300;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = getScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score from the getScore method was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    // if method is lightgray, method not in use
    // void means, don't return anything
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // return data of type int
    public static int getScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            // if gameOver is false
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
