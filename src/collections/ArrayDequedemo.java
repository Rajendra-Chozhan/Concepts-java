package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequedemo {
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();

		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");
		deque.offer("JHG");

		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		}  
}

//ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.

//ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.