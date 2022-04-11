package thread;
class MyBank extends Thread{
	static int amount = 20000;
	synchronized void deposit(int n) {
		amount = amount + n;
		System.out.println("You are in deposit");
		notify();
	}
	synchronized void withdraw(int n) throws InterruptedException {
		if(n>amount) {
			System.out.println("Insufficient balance, deposit first");
			wait();
		}
		else {
			amount = amount - n;
		}
		System.out.println("Your balance is  " + amount);
	}
}

public class BankThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBank mb = new MyBank();
		new Thread() {
			public void run() {
				System.out.println("Deposit ");
				mb.deposit(30000);
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("Withdraw");
				try {
					mb.withdraw(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		System.out.println("You are in main");
	}

}


