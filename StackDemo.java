package thread;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> st=new Stack<>();
st.push("one");
st.push("two");
st.push("three");
st.push("four");
System.out.println(st);
System.out.println(st.pop());
System.out.println(st);
System.out.println(st.peek());
System.out.println(st);
System.out.println(st.search("one"));
System.out.println(st);
int i=st.search("one");
System.out.println(st.get(1));
System.out.println(st.empty());
System.out.println(st);
	}

}
