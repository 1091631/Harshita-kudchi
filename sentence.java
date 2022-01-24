package javastring;

import java.util.Scanner;

public class sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s =sc.nextLine();
		s.toUpperCase();
		for(int i = 0;i<s.length(); i++) {
			if(i==0)
			System.out.print(s.charAt(i) + " .");
			if(s.charAt(i) == ' ')
				System.out.print(s.charAt(i+1) + " .");
		}
	}
}
				
				
						
				
