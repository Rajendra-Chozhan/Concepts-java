package strings;

public class ReverseWords {
	public static void main(String[] args) {
	  
	 
	    String originalStr = "I Love Programming";
	   
	 
	    String []words = originalStr.split("\\s");
	    String reversedString = "";
	 
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = 0; j < word.length(); j++) {
	        reverseWord = word.charAt(j) + reverseWord;
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
	  }
}
