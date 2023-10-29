import java.util.Arrays;
import java.util.Random;

public class Lists implements ListInterface {

    public Lists() {
    }
    public int[] createArray() {
        Random random = new Random();
        int[] array = random.ints(0, 100).distinct().limit(10).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }

    @Override
    public void compareArray(double resultAverage1, double resultAverage2) {
        if(resultAverage1 == resultAverage2) {
            System.out.println("Compare value = ");
        } else if (resultAverage1 > resultAverage2) {
            System.out.println("First array has more average value");
        } else {
            System.out.println("Second array has more average value");
        }
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        double resultAverage = Math.round(sum / array.length);
        System.out.println("\nAverage value List = " + resultAverage + ".\n");
        return resultAverage;
    }



}
