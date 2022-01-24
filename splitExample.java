package javastring;

public class splitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Computer is fun";
		String sp[]=s.split(" ");
		System.out.println();
		for(int i=sp.length-1;i>=0;i--) {
		
		System.out.print(sp[i]+ " ");
	}

}
}
