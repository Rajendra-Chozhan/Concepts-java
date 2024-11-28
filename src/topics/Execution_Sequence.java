package topics;

public class Execution_Sequence {

	static{
	      System.out.println("Hello this is a static block");
	   }
	Execution_Sequence(){
	      System.out.println("Hello this a constructor");
	   }
	   public static void demo() {
	      System.out.println("Hello this is an instance method");
	   }
	   public static void main(String args[]){
		   System.out.println("Main method1");
		   
		   //demo();
	      new Execution_Sequence();
	      demo();
	      System.out.println("Main method2");
	   }

}
