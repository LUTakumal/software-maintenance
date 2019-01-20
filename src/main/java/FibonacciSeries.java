import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciSeries {
    List<Integer> getSeries(Integer seriesLength, Integer startingNumber) {
        List<Integer> seriesList = new ArrayList<Integer>();
        if (seriesLength < 0) {
            throw new InvalidSequenceLengthException("The length of Sequence must be greater than 0");
        } else if (seriesLength == 0) {
            seriesLength = 10;
        }
        Map<Integer, Integer> firstAndSecondNumber = this.getFirstAndSecondNumberOfSeries(startingNumber);
        Integer firstNumber = firstAndSecondNumber.get(0);
        Integer secondNumber = firstAndSecondNumber.get(1);
        seriesList.add(firstNumber);
        seriesList.add(secondNumber);
        for (int i = 0; i < seriesLength - 2; i++) {
            int sum = firstNumber + secondNumber + 1;
            firstNumber = secondNumber;
            secondNumber = sum;
            seriesList.add(sum);
        }
        return seriesList;
    }

    Map<Integer, Integer> getFirstAndSecondNumberOfSeries(Integer startingNumber) {
        Integer num1 = 0;
        Integer num2 = 1;
        Map<Integer, Integer> firstAndSecondNum = new HashMap<Integer, Integer>();
        if (startingNumber < 0) {
            firstAndSecondNum.put(0, 0);
            firstAndSecondNum.put(1, 1);
            return firstAndSecondNum;
        } else if (startingNumber == 0) {
            firstAndSecondNum.put(0, 1);
            firstAndSecondNum.put(1, 1);
            return firstAndSecondNum;
        } else {
            Integer counter = 0;
            Integer sum;
            do {
                sum = num1 + num2;
                if (sum > startingNumber) {
                    firstAndSecondNum.put(counter, sum);
                    counter++;
                }
                num1 = num2;
                num2 = sum;
            } while (counter < 2);
            return firstAndSecondNum;
        }
    }
}
