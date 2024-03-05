import java.util.OptionalDouble;
import java.util.stream.Stream;

public class SumAndAverage {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        int sum = stream.mapToInt(i->i).sum();
        System.out.println("sum "+sum);

        stream = Stream.of(1,2,3,4,5,6,7,8,9);
        OptionalDouble average = stream.mapToDouble(i -> i).average();
        System.out.println("average "+average);
    }

}
