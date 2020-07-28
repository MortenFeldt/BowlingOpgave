package model;

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
       int[] expected = {30,60,90,120,150,180,200,210};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPointsWithOneSpareRandom() {
       int[][] arr = {{6,2},{3,5},{5,5},{1,5},{5,0},{5,4},{8,1}};
       int[] expected = {8,16,27,33,38,47,56};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoSpareRandom() {
       int[][] arr = {{6,2},{3,5},{5,5},{1,5},{5,0},{5,5},{5,4},{8,1}};
       int[] expected = {8,16,27,33,38,53,62,71};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOneSpareStart() {
       int[][] arr = {{5,5},{3,5},{6,2},{1,5},{5,0},{3,0},{5,4},{8,1}};
       int[] expected = {13,21,29,35,40,43,52,61};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoSpareStart() {
       int[][] arr = {{5,5},{5,5},{1,5},{5,0},{1,0},{5,4},{8,1}};
       int[] expected = {15,26,32,37,38,47,56};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithThreeSpareStart() {
       int[][] arr = {{5,5},{5,5},{5,5},{1,5},{5,0},{1,4},{5,4},{8,1}};
       int[] expected = {15,30,41,47,52,57,66,75};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithFourSpareStart() {
       int[][] arr = {{5,5},{5,5},{5,5},{5,5},{5,0},{1,3},{5,4},{8,1}};
       int[] expected = {15,30,45,60,65,69,78,87};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOneSpareEnd() {
       int[][] arr = {{6,2},{3,5},{6,2},{1,5},{5,0},{1,0},{5,4},{5,5}};
       int[] expected = {8,16,24,30,35,36,45,55};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithTwoSpareEnd() {
       int[][] arr = {{7,0},{3,4},{1,5},{5,0},{8,1},{5,5},{5,5}};
       int[] expected = {7,14,20,25,34,49,59};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithThreeSpareEnd() {
       int[][] arr = {{2,3},{5,2},{5,0},{1,5},{5,0},{5,5},{5,5},{5,5}};
       int[] expected = {5,12,17,23,28,43,58,68};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithFourSpareEnd() {
       int[][] arr = {{7,1},{2,4},{5,3},{5,0},{5,5},{5,5},{5,5},{5,5}};
       int[] expected = {8,14,22,27,42,57,72,82};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithOnlySpare() {
       int[][] arr = {{5,5},{5,5},{5,5},{5,5},{5,5},{5,5},{5,5},{5,5}};
       int[] expected = {15,30,45,60,75,90,105,115};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }   
    
    @Test
    public void testPointsWithRandomSpareStrike1() {
       int[][] arr = {{7,1},{5,5},{7,3},{5,0},{10,0},{5,5},{10,0},{5,3}};
       int[] expected = {8,25,40,45,65,85,103,111};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithRandomSpareStrike2() {
       int[][] arr = {{7,3},{5,5},{7,3},{5,0},{10,0},{5,5},{10,0},{10,0}};
       int[] expected = {15,32,47,52,72,92,112,122};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithRandomSpareStrike3() {
       int[][] arr = {{10,0},{5,5},{7,3},{5,0},{10,0},{5,5},{10,0},{5,3}};
       int[] expected = {20,37,52,57,77,97,115,123};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testPointsWithRandomSpareStrike4() {
       int[][] arr = {{2,2},{4,4},{8,0},{10,0},{1,1},{7,2},{4,5},{8,1}};
       int[] expected = {4,12,20,32,34,43,52,61};
       int[] actual = sa.scoreAlgoritmn(arr);
       Assert.assertArrayEquals(expected, actual);
    }

}
