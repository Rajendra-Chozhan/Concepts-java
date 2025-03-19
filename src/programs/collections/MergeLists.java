package programs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java", "Selenium");
        List<String> list2 = Arrays.asList("TestNG", "Cucumber");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);

    }
}
