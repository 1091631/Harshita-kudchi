package thread;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ob=new ArrayList<>();


ob.add(24);
ob.add(56);
ob.add(65);
ob.add(74);
ob.add(98);
System.out.println(ob);
Iterator it=ob.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}


	}

}
