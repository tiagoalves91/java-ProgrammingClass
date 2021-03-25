package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 10000, 8, 200);
        displayHighPosition("Max", 2);
        calculateHighScorePosition(900);
    }

    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighPosition(String playerName, int highScorePosition) {
        System.out.println("Congratz " + playerName + "you managed to get " + highScorePosition);

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

