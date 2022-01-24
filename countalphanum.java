package javastring;

import java.util.Scanner;

public class countalphanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String user=sc.nextLine();
		int alphacount=0;
		int numcount=0;
		boolean f1=false;
		boolean f2=false;
		for(int i=0;i<user.length();i++) {
			char ch=user.charAt(i);
			if((ch>= 'A')&& (ch<='Z') || (ch>='a')&& (ch<='z')) {
				alphacount++;
			}
			else if((ch>='0')&& (ch<='9')) {
				numcount++;
				
			}
			
		}
		System.out.println("total alphabet are:"+alphacount);
		System.out.println("total numbers are:"+numcount);
	}

		
	}


