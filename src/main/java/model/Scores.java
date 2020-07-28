package model;

/**
 * The purpose of Scores: Hold and return scores in array
 * @author Morten
 * @version 1.0
 * @since 28-07-2020
 */

public class Scores {
    
    private int[][] scores;

    public Scores() {
    }

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
