package inheritance;

class AAnimal{  
void eat(){System.out.println("eating...");}  
}  
class DDog extends AAnimal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends AAnimal{  
void meow(){System.out.println("meowing...");}  
}





public class HierarchicalInheritance {
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		
		DDog d = new DDog();
		
		
}}
