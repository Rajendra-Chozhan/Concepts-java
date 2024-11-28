package programs;

import java.util.HashMap;
import java.util.Scanner;

public class Occurence_of_Each_Character {

public static void main(String args[]) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();

	
	str=str.replace(" ","");
	

	
	
	HashMap <Character,Integer> hp = new HashMap<>();
	
	for (int i=0;i<str.length();i++) {
		char[] c = str.toCharArray();
		
		if(hp.containsKey(c[i]))
			
			hp.put(c[i], hp.get(c[i])+1);
			
			else
				
				hp.put(c[i], 1);
		
		
	}
	System.out.println(hp);
}

}
