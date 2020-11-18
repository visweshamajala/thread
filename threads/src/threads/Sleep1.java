package threads;

 class Sleep1 extends Thread {
	 public void run(){
		 
for(int i=0;i<5;i++){
	try{Thread.sleep(1000);}
	catch(InterruptedException e){
		System.out.println(e);
	}
	

	System.out.println(i);
}

	 }
	 
	 public static void main(String[] args) {
		Sleep1 s =new Sleep1();
		Sleep1 s1 =new Sleep1();
		s.start();
		s1.start();
	}
}
