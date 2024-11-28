package topics;

public class Assertion {


		boolean aproveTicket (int age) {
			assert(age >50 && age <120);
			if(age>50)
				{
				System.out.println("Pass");
			return true;
			
			}else {
			return false;
			
			}
			}
		
		public static void main(String args[]){  
			
			Assertion a= new Assertion();
				a.aproveTicket(80);	
		}
	}


