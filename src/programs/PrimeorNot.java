package programs;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=63;
       
        
        boolean flag = true;
        for (int i = 2; i <= number / 2; ++i) {
          // condition for nonprime number
          if (number % i == 0) {
            flag = false;
            break;
          }
        }

        if (!flag)
          System.out.println(number + " is a prime number.");
        else
          System.out.println(number + " is not a prime number.");
      
	}

}
