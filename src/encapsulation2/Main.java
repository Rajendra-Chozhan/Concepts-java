package encapsulation2;

public class Main {

	public static void main(String[] args) {
		
String name;
String color;
String price;
Cars c =new Cars(name="BMW",color="Blue",price="$50000");
	
	System.out.println("Name:"+ c.getName());
	System.out.println("Color:"+c.getColor());
	System.out.println("Price:"+c.getPrice());
	
	System.out.println("Stats after Updation");
	
	c.setName("TOYOTA");
	c.setColor("Red");
	c.setPrice("$1000");
	
	System.out.println("Name:"+ c.getName());
	System.out.println("Color:"+c.getColor());
	System.out.println("Price:"+c.getPrice());
	}
	
	

}
