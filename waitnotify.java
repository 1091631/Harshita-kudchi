package thread;
class Myclass3 extends Thread{
	int total;
	public void run() {
		synchronized(this){
			for(int i=0;i<=10;i++) {
				total=total+1;
				
			}
			notify();
		}
	}
}
public class waitnotify {

	public static void main(String[] args) throws InterruptedException {
	Myclass3 t=new Myclass3();
	t.start();
	synchronized(t){
		System.out.println("waiting for total");
		t.wait();
		System.out.println("Total" + t.total);
	}
	}
}
	
	
	
		// TODO Auto-generated method stub

	


