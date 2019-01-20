import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciSeriesTest {
    FibonacciSeries fibonacciSeries;
    List<Integer> resultList;
    Map<Integer, Integer> firstAndSecondNumber;

    @org.junit.Before
    public void setUp() throws Exception {
        fibonacciSeries = new FibonacciSeries();
        resultList = new ArrayList<Integer>();
        firstAndSecondNumber = new HashMap<Integer, Integer>();
    }
    //Test case for normal behaviour
    @org.junit.Test
    public void getSeries() {
        resultList = fibonacciSeries.getSeries(4, 4);
        Assert.assertTrue("Expected Value is 5, but found " + resultList.get(0), 5 == resultList.get(0));
        Assert.assertTrue("Expected Value is 8, but found " + resultList.get(1), 8 == resultList.get(1));
        Assert.assertTrue("Expected Value is 13, but found " + resultList.get(2), 13 == resultList.get(2));
        Assert.assertTrue("Expected Value is 21, but found " + resultList.get(3), 21 == resultList.get(3));
        Assert.assertTrue("Expected Size of array is 4, but found " + resultList.size(), 4 == resultList.size());

    }
    //Test Case to get first and second number
    @org.junit.Test
    public void getFirstAndSecondNumberOfSeries() {
        firstAndSecondNumber = fibonacciSeries.getFirstAndSecondNumberOfSeries(4);
        Assert.assertTrue("Expected Value is 5, but found " + firstAndSecondNumber.get(0), 5 == firstAndSecondNumber.get(0));
        Assert.assertTrue("Expected Value is 8, but found " + firstAndSecondNumber.get(1), 8 == firstAndSecondNumber.get(1));
    }
    //Test case when length of series is below 0, InvalidSequenceLengthException is thrown by the function
    @org.junit.Test(expected = InvalidSequenceLengthException.class)
    public void faultyInputTest() {
        resultList = fibonacciSeries.getSeries(-1, 4);
    }
    //Test case when user inputs zero (0) as sequence length for default series length, i.e. 10
    @org.junit.Test
    public void defaultSequnceLengthTest() {
        resultList = fibonacciSeries.getSeries(0, 0);
        Assert.assertTrue("Expected Value is 1, but found " + resultList.get(0), 1 == resultList.get(0));
        Assert.assertTrue("Expected Value is 1, but found " + resultList.get(1), 1 == resultList.get(1));
        Assert.assertTrue("Expected Value is 2, but found " + resultList.get(2), 2 == resultList.get(2));
        Assert.assertTrue("Expected Value is 3, but found " + resultList.get(3), 3 == resultList.get(3));
        Assert.assertTrue("Expected Value is 5, but found " + resultList.get(4), 5 == resultList.get(4));
        Assert.assertTrue("Expected Value is 8, but found " + resultList.get(5), 8 == resultList.get(5));
        Assert.assertTrue("Expected Value is 13, but found " + resultList.get(6), 13 == resultList.get(6));
        Assert.assertTrue("Expected Value is 21, but found " + resultList.get(7), 21 == resultList.get(7));
        Assert.assertTrue("Expected Value is 34, but found " + resultList.get(8), 34 == resultList.get(8));
        Assert.assertTrue("Expected Value is 55, but found " + resultList.get(9), 55 == resultList.get(9));
        Assert.assertTrue("Expected Size of array is 10, but found " + resultList.size(), 10 == resultList.size());

    }




}