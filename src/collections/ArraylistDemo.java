package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	
	public static void main(String args[]){  
		
		
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist  
		
		ArrayList list1 =new ArrayList();
		
		
		
		list.add("Ravi");  //0
		list.add("Vijay");   //1
		
		list.add("Ravi");  //2
		list.add("Ajay");  //3
		
		
		list1.add(123);
		list1.add("Ram");
		list1.add(0.11230);
		list1.add(0.130);
		// Printing teh element in the list
		System.out.println("List:"+ list);  
		System.out.println("List1:"+ list1);
		
		
		// Getting the elements from the list 
		String name =list.get(1);
		System.out.println(name);
		
	Object abc =list1.get(0); // since list2 is not predefined with String or any argument
		System.out.println(abc);
		System.out.println("====================================");
		// Updating the elements in the list 
		
		list.set(2,"India");
		System.out.println("List now:"+list);
		
		System.out.println("====================================");
		//Removing the element from list
		
		list1.remove(2);
		System.out.println("List1 now:"+list1);
		System.out.println("====================================");
	// Contains 
	if(list.contains("Ajay")){
		System.out.println("Ajay in the list ");
		
	}
	System.out.println("====================================");
	// Iterating with for loop 
	System.out.println(" Iterating with FOR loop ");
	for (int i=0;i<list.size();i++) {
		
		if(list.contains("Vicky")) {
			
	System.out.println(list.get(i));
	
		}
		
		else {
			
			list.add("Vicky");
			System.out.println("The value is added");
		}
	
	 }
	System.out.println("The list already contains the value");
	
	System.out.println("====================================");
//Iterating with Enhanced For loop
System.out.println("Iterating with Enhanced Forloop");
	for(String str : list) {
		System.out.println(str);
		
	}
	
	
	//Iterating with Iterator 
	System.out.println("====================================");
	
	System.out.println("Iterator");
Iterator <String> itr = list.iterator();

// Iterator is a method. that will give element one by one 

while(itr.hasNext()) {
	
	System.out.println(itr.next());
}



	}
}

//The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. 
//The ArrayList class maintains the insertion order and is non-synchronized. 
//The elements stored in the ArrayList class can be randomly accessed.



