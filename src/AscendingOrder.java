import java.util.stream.Stream;

public class AscendingOrder {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(8,5,1,2,3,9,6);
        Stream<Integer> sorted = stream.sorted();
        sorted.forEach(i-> System.out.println(i));
    }
}
