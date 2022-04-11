package thread;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]= {"Harshita","Manisha","Harshita","Harshita","Surabhi","Ananaya"};
ArrayList<String> nameList=new ArrayList<>();
for(String s:names) {
	if(!(nameList.contains(s))) {
		nameList.add(s);
		
	}
}
Iterator it=nameList.iterator();
System.out.println("After Remove duplicate names");
while(it.hasNext()) {
	System.out.println(it.next());
	}

}
}
