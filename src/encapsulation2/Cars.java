package encapsulation2;

public class Cars {

	private String name;
	private String color;
	private String price;
	
	public Cars(String name,String color,String price) {
		
		this.color=color;
		this.price=price;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
