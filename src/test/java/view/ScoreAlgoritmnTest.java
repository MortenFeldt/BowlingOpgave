package view;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Morten Feldt
 */
public class ScoreAlgoritmnTest {

    ScoreAlgoritmn sa = new ScoreAlgoritmn();

    @Test
    public void testPointsWithoutBonus() {
       int[][] arr = {{6,2},{3,5},{1,5},{5,0},{5,4},{8,1}};
       int[] expected = {8,16,22,27,36,45};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOneStrikeRandom() {
       int[][] arr = {{6,2},{3,5},{10,0},{1,5},{5,0},{5,4},{8,1}};
       int[] expected = {8,16,32,38,43,52,61};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoStrikeRandom() {
       int[][] arr = {{6,2},{3,5},{10,0},{1,5},{5,0},{10,0},{5,4},{8,1}};
       int[] expected = {8,16,32,38,43,62,71,80};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOneStrikeStart() {
       int[][] arr = {{10,0},{3,5},{6,2},{1,5},{5,0},{10,0},{5,4},{8,1}};
       int[] expected = {18,26,34,40,45,64,73,82};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoStrikeStart() {
       int[][] arr = {{10,0},{10,0},{1,5},{5,0},{10,0},{5,4},{8,1}};
       int[] expected = {21,37,43,48,67,76,85};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithThreeStrikeStart() {
       int[][] arr = {{10,0},{10,0},{10,0},{1,5},{5,0},{10,0},{5,4},{8,1}};
       int[] expected = {30,51,67,73,78,97,106,115};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithFourStrikeStart() {
       int[][] arr = {{10,0},{10,0},{10,0},{10,0},{5,0},{10,0},{5,4},{8,1}};
       int[] expected = {30,60,85,100,105,124,133,142};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOneStrikeEnd() {
       int[][] arr = {{10,0},{3,5},{6,2},{1,5},{5,0},{10,0},{5,4},{10,0}};
       int[] expected = {18,26,34,40,45,64,73,83};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoStrikeEnd() {
       int[][] arr = {{10,0},{10,0},{1,5},{5,0},{8,1},{10,0},{10,0}};
       int[] expected = {21,37,43,48,57,77,87};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithThreeStrikeEnd() {
       int[][] arr = {{10,0},{10,0},{10,0},{1,5},{5,0},{10,0},{10,0},{10,0}};
       int[] expected = {30,51,67,73,78,108,128,138};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithFourStrikeEnd() {
       int[][] arr = {{10,0},{2,4},{5,3},{5,0},{10,0},{10,0},{10,0},{10,0}};
       int[] expected = {16,22,30,35,65,95,115,125};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOnlyStrike() {
       int[][] arr = {{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0}};
       int[] expected = {30,60,90,120,150,180,210,240};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    

}
