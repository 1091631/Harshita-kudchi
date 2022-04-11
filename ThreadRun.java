package thread;
class Myclass1 implements Runnable{
	public void run() {
		System.out.println("run method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Myclass1 ob =new Myclass1();
Thread tob=new Thread(ob);
Myclass1 ob1 =new Myclass1();
Thread tob1=new Thread(ob1);
tob.start();
tob.join();
tob1.start();

	}

}
