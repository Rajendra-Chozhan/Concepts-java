package run_time_polymorphism;

public class Childd extends Parentt{
	
	public void disp(){
		System.out.println("disp() method of Child class");
	   }
	   public void newMethod(){
		System.out.println("new method of child class");
	   }

	public static void main(String[] args) {

		Parentt obj = new Parentt();
		obj.disp();

		/* When parent class reference refers to the child class object
		 * then the overriding method (method of child class) is called.
		 * This is called dynamic method dispatch and runtime polymorphism
		 */
		Parentt obj2 = new Childd();
		obj2.disp();
		
		
		
		Parentt p = new Childd();
		p.disp();                    // Upcast
		
		
		 Childd c = (Childd)p; 
		 c.disp();
		
	}

}
