package inheritance;




class Animal{  
void eat(){
System.out.println("Animal is Eating...");
}  
}  

class Dog extends Animal{  
void bark(){
System.out.println("Dog is barking...");
}  
} 


class Singleinheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
Animal a  = new Animal();
a.eat();

d.bark();
d.eat();}}  