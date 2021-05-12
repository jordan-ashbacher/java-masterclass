public class methods {
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("Your final score is " + calculateScore(gameOver, score, levelCompleted, bonus)); 
        System.out.println("Your final score is " + calculateScore(true, 1000, 8, 200));

        displayHighScorePosition("Jordan", 1500);
        displayHighScorePosition("Greta", 900);
        displayHighScorePosition("Kieu", 400);
        displayHighScorePosition("Eric", 50);
    
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            // System.out.println("Your final score is " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int score) {
        System.out.println(name + " is in position " + calculateHighScorePosition(score) + " on the high score chart");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }

    
}