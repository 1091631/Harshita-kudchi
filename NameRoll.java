package thread;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int roll;
	String strname;
	float fees;
	public Student(int i,String string,int j) {
		roll=i;
		strname=string;
		fees=j;
	}
	
}
public class NameRoll {

	private static String strname;
	private static String fee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ob1= new Student(1,"Harshita",1000);
Student ob2= new Student(1,"Manisha",2000);
ArrayList<Student> ob=new ArrayList<>();
ob.add(ob1);
ob.add(ob2);
System.out.println(ob);
Iterator it=ob.iterator();
while(it.hasNext()) {
	Student ob3=(Student) it.next();

	System.out.println("roll num:"+roll);
	System.out.println("name:"+ob.strname);
	System.out.println("fee:"+ob.fee);
	}

}
}
