import java.util.Arrays;
import java.util.List;

public class Third {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        int prod = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Sum = " + sum);
        System.out.println("Prod " + prod);
    }

}