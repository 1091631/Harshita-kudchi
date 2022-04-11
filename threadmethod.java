package thread;
class MyClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run method"+Thread.currentThread()+"i="+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

public class threadmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("JVM Thread"+Thread.currentThread());
		MyClass ob1=new MyClass();
		MyClass ob2=new MyClass();
		ob1.setName("FirstThread");
		ob2.setName("SecondThread");
		ob1.start();
		ob1.join();
		ob2.start();
		
	}

}
