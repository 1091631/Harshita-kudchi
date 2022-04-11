package thread;
class Table{
	synchronized void print(int n,String g) {
		for(int i=1;i<=10;i++) {
			System.out.println("5x"+i+"="+n*i);
			
		}
	}
}
class FirstThread extends Thread{
	Table t;
	public FirstThread(Table te) {
		this.t=te;
	}
		public void run() {
			t.print(5,"Hello");
		
	}

	class SecondThread extends Thread{
		Table t;
		public SecondThread(Table te) {
			this.t=te;
		}

		public void run() {
			t.print(10,"Hi");
			
		}
	

	}
}
public class Synchronizedthread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Table te = new Table();//common object
		FirstThread t1 = new FirstThread(te);
		
		t1.start();
		
		

	}

}
