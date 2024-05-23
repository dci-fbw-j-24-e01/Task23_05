import java.util.ArrayList;
import java.util.List;


public class Fourth {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            listNumbers.add(i);
        }

        List<Integer> result = (List<Integer>) listNumbers.stream()
                .filter(i -> i % 3 == 0)
                .map(i -> i * i)
                .limit(10)

                .toList();

        long end = System.currentTimeMillis() - start;
        result.forEach(System.out::println);

        System.out.println(end + " ms");
    }

}
