package facade;

import model.ScoreAlgoritmn;

/**
 * Facade class to methods used for REST
 * @author Morten Feldt
 */

public class ScoreFacade implements IScoreFacade{

    @Override
    public int[] getTotals(int[][] scoresArr) {
        ScoreAlgoritmn sa = new ScoreAlgoritmn();
        return sa.scoreAlgoritmn(scoresArr);
    }

}
