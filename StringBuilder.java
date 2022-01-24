package javastring;

public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder strSB = new StringBuilder("This is example of");
strSB.append("append method.");
System.out.println(strSB);

StringBuilder strSB1 = new StringBuilder("This is a program");
strSB1.insert(10, "java");
System.out.println(strSB1);

StringBuilder strSB2 = new StringBuilder("This is a program");
strSB2.replace(0,9,"java");
System.out.println(strSB2);
	}

	
		// TODO Auto-generated method stub
		
	}

}
