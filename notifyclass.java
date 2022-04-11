package thread;
class MyMethod extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			
		for(int i=1;i<=50;i++) {
			total+=i;
			
			
		}
		notify();
		
	}
}
}


public class notifyclass {

	public static void main(String[] args) throws InterruptedException {
		MyMethod t=new MyMethod();  //Thread-0 , main
		t.start();
		synchronized (t) {
			
			 System.out.println("Waiting for Total");
		          t.wait();//
		          System.out.println("Total "+t.total);
	
 
		// TODO Auto-generated method stub

	}

	}
}

