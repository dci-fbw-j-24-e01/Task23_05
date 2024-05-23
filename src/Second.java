import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import second.Person;

public class Second {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joy", 25));
        people.add(new Person("Margaret", 17));
        people.add(new Person("Bill", 39));
        people.add(new Person("Lana", 18));
        people.add(new Person("Sunanda", 19));
        people.add(new Person("Desi", 21));
        people.add(new Person("Inda", 210));
        people.add(new Person("Alex", 18));
        people.add(new Person("Vitt", 14));

       List<String> names = people.stream()
                .filter( x -> x.age()< 18)
                .map(o1 -> o1.name())
                .toList();
//                .collect(Collectors.groupingBy(Person::name, Collectors.mapping(Person::age, Collectors.toList())));
        names.forEach(System.out::println);

    }
}
