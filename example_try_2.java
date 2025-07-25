import java.util.*;
import java.util.stream.Collectors;

public class LambdaWithCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Andrew");

        // 1. Print all names
        System.out.println("All Names:");
        names.forEach(name -> System.out.println(name));

        // 2. Filter names starting with "A"
        System.out.println("\nNames starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // 3. Sort names alphabetically
        System.out.println("\nSorted Names:");
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}
