package programs.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateinList {

    public static void main(String[] args) {

        List<String> elements = Arrays.asList("Selenium", "Java", "TestNG", "Selenium","Selenium","Selenium","Selenium");
        Map<String, Integer> countMap = new HashMap<>();

        for (String element : elements) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey());
            }
        }

    }
}
