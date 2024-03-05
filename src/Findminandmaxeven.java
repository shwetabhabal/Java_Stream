import java.util.stream.Stream;

public class Findminandmaxeven {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> evenStream = stream.filter(n -> n % 2 == 0);
        System.out.println(evenStream.min((a,b)->a-b));;

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> evenStream2 = stream2.filter(n -> n % 2 == 0);
        System.out.println(evenStream2.max((a,b)->a-b));
    }
}