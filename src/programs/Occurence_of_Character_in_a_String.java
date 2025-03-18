package programs;

import collections.Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Occurence_of_Character_in_a_String {

	public static void getcharctercount(String str){

		//String str = "aabbjjjcccchar";
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		char strarray[] = str.toCharArray();
		for (char c : strarray){

			if (hp.containsKey(c)) {
				hp.put(c, hp.get(c) + 1);
			}
			else{
				hp.put(c, 1);
			}
	}

		System.out.println("The character count in string " +
				str +":"+hp);


	}
	public static void main(String[] args) {

	getcharctercount("test");
		getcharctercount("jkghjgtrytfytrthtfnffdsaewarefgkjniohguyrtyfghfhgv");
	}}
	    

