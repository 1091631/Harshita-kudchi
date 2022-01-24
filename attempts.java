package javastring;

import java.util.Scanner;

public class attempts {

	public static void main(String[] args) {
		String un,up;
		Scanner sc =new Scanner(System.in);
		int c=1;
		System.out.println("Enter your name");
		un = sc.next();
		System.out.println("Enter  your password");
		up= sc.next();
		
		System.out.println();
		if(un.equalsIgnoreCase("Harshita") && up.equals("Harshu123")) {
			System.out.println("Login successfull");	
		
	}
		else 
		{ 
			System.out.println("Invalid credential");
		}
	c++;
	while(c<=3);
	System.out.println(c+" attempts are over");

}
}





