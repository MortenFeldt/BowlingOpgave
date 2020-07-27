package view;

/**
 * The purpose of ScoreAlgoritmn: Holds the algoritmn for calculation bowling score
 * @author Morten Feldt
 * @version 1.0
 * @since 27-07-2020
 */

public class ScoreAlgoritmn {
    public int[] scoreAlgoritmn(int[][] arr){
        int[] samletScore = new int[arr.length];
        final int MAXSCORE = 10;
        int currentScore = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int[] currentArr = arr[i];
            currentScore += currentArr[0];
            currentScore += currentArr[1];
            if(i > 0){
                currentScore += samletScore[i - 1];
            }
            samletScore[i] = currentScore;
            currentScore = 0;
        }
        return samletScore;
    }
}
