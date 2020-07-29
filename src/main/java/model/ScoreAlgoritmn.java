package model;

/**
 * The purpose of ScoreAlgoritmn: Holds the algoritmn for calculation bowling
 * score
 *
 * @author Morten Feldt
 * @version 1.0
 * @since 27-07-2020
 */
public class ScoreAlgoritmn {
    
    public int[] scoreAlgoritmn(int[][] arr) {
        final int MAXSCORE = 10;
        int currentScore = 0;
        boolean spare = false;
        boolean strike = false;
        int[] samletScore = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int[] currentArr = arr[i];
            currentScore += currentArr[0];
            currentScore += currentArr[1];
            if(currentScore % 10 == 0 && currentArr[0] != 10 && currentScore > 0){
                spare = true;
            }
            if(currentArr[0] == MAXSCORE){
                strike = true;
            }
            if (i > 0) {
                currentScore += samletScore[i - 1];
            }

            if (strike) {
                if(i < arr.length - 1){
                    if (arr[i + 1][0] == MAXSCORE) {
                        currentScore += arr[i + 1][0];
                        if(i + 2 <= arr.length - 1){
                            currentScore += arr[i + 2][0];
                        }
                    } else {
                        currentScore += arr[i + 1][0];
                        currentScore += arr[i + 1][1];
                    }
                }

            }
            
            if(spare){
                if(i < arr.length - 1){
                    currentScore += arr[i + 1][0];
                }
            }
            
//            if(currentScore > 300){
//                currentScore = 300;
//            }
            samletScore[i] = currentScore;
            currentScore = 0;
            spare = false;
            strike = false;
        }

        return samletScore;
    }

//    public int[] scoreAlgoritmn(int[][] arr) {
//        final int MAXSCORE = 10;
//        int currentScore = 0;
//        boolean spare = false;
//        boolean strike = false;
//        int[] samletScore = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            int[] currentArr = arr[i];
//            currentScore += currentArr[0];
//            currentScore += currentArr[1];
//            if(currentScore % 10 == 0 && currentArr[0] != 10){
//                spare = true;
//            }
//            if(currentArr[0] == MAXSCORE){
//                strike = true;
//            }
//            if (i > 0) {
//                currentScore += samletScore[i - 1];
//            }
//
//            if (strike) {
//                if(i < arr.length - 1){
//                    if (arr[i + 1][0] == MAXSCORE) {
//                        currentScore += arr[i + 1][0];
//                        if(i + 2 <= arr.length - 1){
//                            currentScore += arr[i + 2][0];
//                        }
//                    } else {
//                        currentScore += arr[i + 1][0];
//                        currentScore += arr[i + 1][1];
//                    }
//                }
//
//            }
//            
//            if(spare){
//                if(i < arr.length - 1){
//                    currentScore += arr[i + 1][0];
//                }
//            }
//
//            samletScore[i] = currentScore;
//            currentScore = 0;
//            spare = false;
//            strike = false;
//        }
//
//        return samletScore;
//    }
}
