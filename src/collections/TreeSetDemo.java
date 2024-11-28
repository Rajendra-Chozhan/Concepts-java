package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]){  
		//Creating and adding elements  
		//Unique and sorting in ascending order 
		// data is unordered but arranged in Alphabetical order 
		// Treeset is Sorting version of Hashset 
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
}
