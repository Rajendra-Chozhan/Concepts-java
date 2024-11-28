package iinterface;

interface Printable{  
void print();

}  
interface Showable{  
void print();  
}  
  
class Mul_inheritance implements Printable, Showable{  
public void print()

{System.out.println("Hello");}  


public static void main(String args[]){  
	Mul_inheritance obj = new Mul_inheritance();  
obj.print();  
 }  
}  