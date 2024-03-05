import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //creating stream
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        //Iterating through stream
//        stream.forEach(n -> System.out.println(n));

        //Transform each element to doublegit
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
//        Stream<Integer> doubleStream = stream1.map(n -> n * 2);
//        doubleStream.forEach(n-> System.out.println(n));

        //to store value into a new List
        List<Integer> doubleValue = stream1.map(n-> n*2).collect(Collectors.toList());
        System.out.println(doubleValue);

        //filter the even numbers from the number Stream
        Stream<Integer> evenStream = stream.filter(n -> n % 2 == 0);
        evenStream.forEach(n-> System.out.println(n));
    }
}