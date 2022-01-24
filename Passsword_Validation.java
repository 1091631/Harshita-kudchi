package javastring;

import java.util.Scanner;

public class Passsword_Validation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if(username.equals("Harshita") && password.equals("Harshu123"))
			System.out.println("Login successfull");	
		else
			System.out.println("Invalid credential");
			
		
	}

}
