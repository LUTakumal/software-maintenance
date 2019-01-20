import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assignment1Main {
    public static void main(String args[]) throws IOException {
        Scanner userInput = new Scanner(System.in);
        Integer seriesLength = 0, startingNumber = 0;
        try {
            System.out.print("Enter Total Length of Fibonacci Series [Enter 0 for default length, i.e. 10]: ");
            seriesLength = userInput.nextInt();
            System.out.print("Enter Starting Number of Series: ");
            startingNumber = userInput.nextInt();
        } catch (InputMismatchException im) {
            System.err.println("Input Data Type mismatch");
            System.exit(0);
        }
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        List<Integer> series = fibonacciSeries.getSeries(seriesLength, startingNumber);
        Assignment1Main.writeToFile(seriesLength, startingNumber, series);
    }

    /**
     * Method to write output in the file named as output.txt
     * @param seriesLength
     * @param startingNumber
     * @param output
     * @throws IOException
     */
    public static void writeToFile(Integer seriesLength, Integer startingNumber, List<Integer> output) throws IOException {
        String contentToWrite = "Series Length: " + seriesLength + ", Starting Number Before Printed Number: " + startingNumber + ", Output:  " + output;
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(contentToWrite);
        writer.close();
    }
}
