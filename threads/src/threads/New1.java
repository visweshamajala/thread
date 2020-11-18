package threads;

public class New1 extends Thread {
	
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		New1 t1=new New1();  
		t1.start();  
		 }  
		}  


