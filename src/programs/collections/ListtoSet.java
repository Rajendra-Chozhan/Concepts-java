package programs.collections;
import java.util.*;
public class ListtoSet {

    // Java program to demonstrate conversion of
// list to set using simple traversal



        public static void main(String[] args)
        {

            // Creating a list of strings
            List<String> aList = Arrays.asList("Geeks", "for",
                    "GeeksQuiz", "GeeksforGeeks", "GFG");

            Set<String> hSet = new HashSet<String>();
            for (String x : aList)
                hSet.add(x);

            System.out.println("Created HashSet is");
            for (String x : hSet)
                System.out.println(x);

            // We can created TreeSet same way
        }
    }


