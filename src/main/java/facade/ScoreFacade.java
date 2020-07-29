package facade;

import model.ScoreAlgoritmn;

/**
 * The purpose of ScoreFacade: Class to methods used for connection to REST
 * @author Morten Feldt
 * @version 1.0
 * @since 29-07-2020
 */

public class ScoreFacade implements IScoreFacade{

    @Override
    public int[] getTotals(int[][] scoresArr) {
        ScoreAlgoritmn sa = new ScoreAlgoritmn();
        return sa.scoreAlgoritmn(scoresArr);
    }

}
