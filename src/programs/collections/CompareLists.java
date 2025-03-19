package programs.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompareLists {

    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("Selenium", "Java", "Java", "TestNG", "Selenium", "Selenium");
        List<String> list2 = Arrays.asList("Selenium", "Java");

        System.out.println(list1.equals(list2));

        Collections.shuffle(list1);
        System.out.println((list1));

        Map<String, Long> occurrences = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(occurrences);

        List<String> names = Arrays.asList("TestNG", "Selenium", "Java");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

    }
}
