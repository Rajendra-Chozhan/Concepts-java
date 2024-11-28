package programs;

import java.util.Scanner;

public class Occurence_of_Character_in_a_String {

	
	public static void main(String[] args)
    {
  
		
		String input = "Java is good Language to learn";
		
		int stringlength = input.length();
		int stringlengthwithout_a = input.replace("a", "").length();
		
		int count =stringlength-stringlengthwithout_a;
		System.out.println("The Occurence of a in the string is "+ count);
	    
}}
