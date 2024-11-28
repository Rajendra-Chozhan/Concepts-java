package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String args[]){  
		
		
		// FIFO
		//sorting
		
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();  
		for(int i=10;i>0;i--) {
			q.add(i);
		}
		
		// Queue : (Front) 10 9 8 7 6 5 4 3 2 1 0 (Rear)
		// Priority Queue sorts data for us 
		// Queue (Front) 0 1 2 3 4 5 6 7 8 9 10 (Rear)
		System.out.println("Queue size:"+ q.size());
		System.out.println(q.peek()); // Head of Queue
		q.remove();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++After Removing head element ++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(q.peek());
		
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		queue.remove();  
		System.out.println(queue.peek());
		queue.poll();  
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
}
