package keywords;


class Animal{  
String color="white";  

void printsomething() {
	System.out.println("ABC");
}
}  
class Dog extends Animal{  
String color="black"; 

void printColor(){  
	
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  


super.printsomething();
}

}  






public class Super_Test {
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
		}
}
