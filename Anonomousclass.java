package thread;
class table1{
synchronized void print(int n) {
	for(int i=1;i<=10;i++) {
		System.out.println("5x"+i+"="+n*i);
		
	}
}
}
public class Anonomousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table tb=new Table();
Thread t=new Thread() {
	public void run() {
		System.out.println("inside run");
		tb.print(8);
	}
};
t.start();
Thread t1=new Thread() {
	public void run() {
		System.out.println("inside run");
		tb.print(4);
	}
};


	}

}
