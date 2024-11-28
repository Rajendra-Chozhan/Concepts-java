package constructors;

public class ParamaterizedConstructor {

	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
	//creating objects  
		ParamaterizedConstructor s1=new ParamaterizedConstructor();  
		ParamaterizedConstructor s2=new ParamaterizedConstructor();  
	//displaying values of the object  
	s1.display();  
	s2.display();  
	}  
	}  