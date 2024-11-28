package keywords;

public class FinaliseMethod {

	
	 public static void main(String[] args)
	    {
	        String a = "Hello World!";
	        a = null; // unreferencing string object
	        
	        /*
	         * In the above program, when the String object a holds value Hello World! it has a reference to an object of the String class.
	        But, when it holds a null value it does not have any reference. 
	        Hence, it is eligible for garbage collection.
	        The garbage collector calls finalize() method to perform clean-up before destroying the object.
	        
	        */
	    }
}
