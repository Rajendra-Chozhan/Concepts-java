package exceptions;

public class Classnotfound {
	
	// Java Program to Illustrate ClassNotFoundException


		// Main driver method
		public static void main(String args[])
		{

			// Try block to check for exceptions
			try {

				Class.forName("GeeksForGeeks");
			}

			// Catch block to handle exceptions
			catch (ClassNotFoundException ex) {

				// Displaying exceptions on console along with
				// line number using printStackTrace() method
				ex.printStackTrace();
			}
		}
	


}
