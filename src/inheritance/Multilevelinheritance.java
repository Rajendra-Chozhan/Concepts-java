package inheritance;

class Animall{  
void eat(){
System.out.println("eating...");}  
}  

class Dogg extends Animall{  
void bark(){
System.out.println("barking...");}  
} 

class BabyDog extends Dogg{  
void weep(){
System.out.println("weeping...");}  
}  



public class Multilevelinheritance {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
		
	}

}
