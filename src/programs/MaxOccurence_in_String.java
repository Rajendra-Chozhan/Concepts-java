package programs;

import java.util.Scanner;

public class MaxOccurence_in_String {

	
	public static void main(String[] args) {
		String str;
		char maxChar = ' ';
		int i, max = -1;
		int[] count = new int[256];
		
	Scanner sc= new Scanner(System.in);

		System.out.print("\nEnter String to find Maximum Char Occurrence =  ");
		str = sc.nextLine();
		
		for(i = 0; i < str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		for(i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(max < count[ch]) {
				max = count[ch];
				maxChar = ch;
			}
		}
		System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
		System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	

		
	}

}
