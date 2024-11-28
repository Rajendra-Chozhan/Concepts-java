package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraytoList {

	
	public static void main(String args[]) {
		
		
		
		String []colors = {"Red","Blue","Orange"};
		
		for (int i = 0; i < colors.length; i++) {   
            System.out.print(colors[i] + " ");   
        }  
		
		List a = Arrays.asList(colors);
		System.out.println(a);
		
		
		int numbers[] = {1,2,3,4,5,6};
		
		for (int i = 0; i < numbers.length; i++) {   
            System.out.print(numbers[i] + " ");   
        }  
		
		
		List <String> l = new ArrayList<>();
		Collections.addAll(l, colors);
		System.out.print(l);
		
	}
}
