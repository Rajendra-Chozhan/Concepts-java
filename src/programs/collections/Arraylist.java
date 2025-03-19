package programs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        String[] arr = {"Selenium", "Java"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("TestNG");
        System.out.println(list);

    }
}
