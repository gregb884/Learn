package codewars;

import java.util.stream.DoubleStream;
public class SumArray {

    public static double sum(double[] numbers)
    {
        if(numbers.length == 0)
        {
            return 0.0;
        }

        double sum = DoubleStream.of(numbers).sum();

        return sum;
    }
}