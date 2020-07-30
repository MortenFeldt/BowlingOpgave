package model;

/**
 * Class for bowling scores in array
 * @author Morten Feldt
 */

public class Scores {
    
    private int[][] scores;

    public Scores(int[][] scores) {
        this.scores = scores;
    }

    public int[][] getScores() {
        return scores;
    }

    public void setScores(int[][] scores) {
        this.scores = scores;
    }
    
}
