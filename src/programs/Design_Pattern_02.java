package programs;

public class Design_Pattern_02 {

public static void main(String args[]) {

	int rows = 6;
	System.out.println("\nThe star pattern is... ");
	for (int i = 1; i <= rows; i++)
	{
	for (int j = rows; j > i; j--)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	}

}
