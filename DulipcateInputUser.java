package thread;

import java.util.Scanner;

public class DulipcateInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n[];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the names");
int num=sc.nextInt();
n=new String[num];
System.out.println("Enter names"+num);
for(int i=0;i<n.length;i++) {
	n[i]=sc.nextLine();
}
	System.out.println("Names of students");
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	
}
}

}

