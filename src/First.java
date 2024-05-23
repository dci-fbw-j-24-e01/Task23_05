import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        numbers.stream()
                .filter(n -> n % 2 == 0)
//                .map(n -> n*n)
//                .forEach(System.out::println);
                .forEach(n -> System.out.println(n + "\t" + (int) Math.pow(n, 2)));

    }
}