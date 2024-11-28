package run_time_polymorphism;

class Vehicle{  
	  void run(){
		  System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class Bike extends Vehicle{ 
		void run(){
			System.out.println("Bike is running safely");
			}  
	  public static void main(String args[]){  
	  //creating an instance of child class  
	  Bike b =  new Bike();  
	  
	  //calling the method with child class instance 
	  
	  b.run();  
	  
	  
	  Vehicle v = new Vehicle();
	  v.run();
	  }  
	}  
