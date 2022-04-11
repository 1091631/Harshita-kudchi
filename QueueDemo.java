package thread;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer>obq=new PriorityQueue<>();
obq.add(1);
obq.add(2);
obq.add(3);
obq.remove();
System.out.println(obq);

//obq.offer(null);
//System.out.println(obq);
//obq.element();
//System.out.println(obq);
obq.peek();
System.out.println(obq);

	}

}
