import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //creating stream
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        //Iterating through stream
        stream.forEach(n -> System.out.println(n));
    }
}