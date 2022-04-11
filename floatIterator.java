package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class floatIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Float> ob1=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("How many elements of floating point value");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
System.out.println("Enter element");
Float val=sc.nextFloat();
ob1.add(val);
}
Iterator it=ob1.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
for(Float f:ob1) {
	System.out.println(f);
}

System.out.println(Collections.min(ob1));


}
	}

