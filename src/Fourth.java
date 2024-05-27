import java.util.ArrayList;
import java.util.List;


public class Fourth {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<Integer> listNumbers = listOfIntegers();


        long firstAnd = System.currentTimeMillis() - start;
        listNumbers.stream()
                .filter(i -> i % 3 == 0)
                .map(Math::sqrt)
                .limit(10)
                .forEach( i -> System.out.println(i + " "));

        long end = System.currentTimeMillis() - start;
        System.out.println(firstAnd + " ms");
        System.out.println(end + " ms");
    }

    private static List<Integer> listOfIntegers() {
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            listNumbers.add(i);
        }
    return listNumbers;
    }

}
