package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main(String args[]){  
		//Creating HashSet and adding elements 
		
		HashSet<String> set=new HashSet<String>();  
		
		HashSet set1=new HashSet();  
		
		
		
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		
		set1.add("Ravi");  
		set1.add(125);  
		set1.add(0.2582);  
		set1.add("Ajay"); 
		
		
		//Traversing elements  
		// data is unordered due to hashing 
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	
	Iterator itr1 = set1.iterator();  
	while(itr1.hasNext()){  
	System.out.println(itr1.next());  
	}  
	}  

	
}


//HashSet class implements Set Interface. 
//It represents the collection that uses a hash table for storage.
// Hashing is used to store the elements in the HashSet. It contains unique items.


