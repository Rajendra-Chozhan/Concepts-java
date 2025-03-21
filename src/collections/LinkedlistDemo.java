package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");
		//al.poll();
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  }


//LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. 
//It maintains the insertion order and is not synchronized. 
//In LinkedList, the manipulation is fast because no shifting is required.