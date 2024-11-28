package casting;

public class Main_Class {

	public static void main(String[] args) {


		Parent_Class p = new Parent_Class();    // printing parents method
	p.show();
		
	
	Parent_Class obj = new Child_Class();// upcasting
	obj.show();
	
	
	// Child_Class a = new Parent_Class(); 

	
		Child_Class c = (Child_Class) obj;  // downcasting
c.show();
	}

	
}





