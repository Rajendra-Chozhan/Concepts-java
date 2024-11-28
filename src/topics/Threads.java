package topics;

class Threads implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	Threads a=new Threads();  
Thread t1 =new Thread(a);  
a.run();
t1.start();  
 }  
}  