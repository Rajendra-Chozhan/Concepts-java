package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		
        System.out.println("Enter the string to be reversed");
        
        Scanner in = new Scanner(System.in);
        
        original = in.nextLine();
        int length = original.length();
        
        for(int i=0;i<length; i++) {
        	
        //	char ch =  original.charAt(i);
        	char [] cha = original.toCharArray();
            reverse = cha[i] + reverse;   //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
    }

}
