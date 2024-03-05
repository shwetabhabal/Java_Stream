import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //creating stream
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        //Iterating through stream
        stream.forEach(n -> System.out.println(n));

        //Transform each element to doublegit
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> doubleStream = stream1.map(n -> n * 2);
        doubleStream.forEach(n-> System.out.println(n));
    }
}