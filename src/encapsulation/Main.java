package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee();
	
		e.setId(1085353);
		e.setName("Rajendra Chozhan");
		e.setSalary(30000);
		
		System.out.println("Name:" + e.getName());
		System.out.println("ID:" + e.getId());
		System.out.println("Salary:" + e.getSalary());
	}

}


// All variables are accessed through methods