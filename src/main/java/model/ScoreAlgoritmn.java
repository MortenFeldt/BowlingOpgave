package model;

/**
 * Algoritmn for calculation bowling scores
 * @author Morten Feldt
 */
public class ScoreAlgoritmn {

    public int[] scoreAlgoritmn(int[][] arr) {
        final int MAX_SCORE = 10;
        final int ROUNDS_IN_A_GAME = 10;
        int currentScore = 0;
        boolean spare = false;
        boolean strike = false;
        int[] samletScore;
        
        if(arr.length > ROUNDS_IN_A_GAME){
            samletScore = new int[ROUNDS_IN_A_GAME];
        } else {
            samletScore = new int[arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            int[] currentArr = arr[i];
            currentScore += currentArr[0];
            currentScore += currentArr[1];

            if (currentScore == MAX_SCORE && currentArr[0] != MAX_SCORE) {
                spare = true;
            }
            if (currentArr[0] == MAX_SCORE) {
                strike = true;
            }

            if (i > 0) {
                currentScore += samletScore[i - 1];
            }

            if (strike) {
                if (i < arr.length - 1) {
                    if (arr[i + 1][0] == MAX_SCORE) {
                        currentScore += arr[i + 1][0];
                        if (i + 2 <= arr.length - 1) {
                            currentScore += arr[i + 2][0];
                        } else {
                            currentScore += arr[i + 1][1];
                        }
                    } else {
                        currentScore += arr[i + 1][0];
                        currentScore += arr[i + 1][1];
                    }
                }

            }

            if (spare) {
                if (i < arr.length - 1) {
                    currentScore += arr[i + 1][0];
                }
            }
            
            if(i < ROUNDS_IN_A_GAME){
                samletScore[i] = currentScore;
            }
            currentScore = 0;
            spare = false;
            strike = false;
        }

        return samletScore;
    }
}
