package programs.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintOddNumbers {

    public static List<Integer> getOddNumbers(int[] nums) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        return oddNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> oddNumbers = getOddNumbers(nums);

        System.out.println("Output: " + oddNumbers);
    }
}
