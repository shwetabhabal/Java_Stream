import java.util.stream.Stream;

public class AllorAtleastOneEven    {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        boolean alleven = stream.allMatch(n-> n%2==0);
        System.out.println(alleven);

        stream = Stream.of(1,2,3,4,5,6,7,8,9);
        boolean anyEven = stream.anyMatch(n-> n%2==0);
        System.out.println(anyEven);
    }
}
