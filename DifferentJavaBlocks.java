package oopjava;

public class DifferentJavaBlocks {
	static String cname;
	static {
		cname="Edubridge";
		System.out.println("Static block DifferentJavaBlocks");
		
	}
	{
		System.out.println("Normal Blocks");
		
	}
	DifferentJavaBlocks() {
		System.out.println("Constructor blocks");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		DifferentJavaBlocks ob=new DifferentJavaBlocks();
	}

}
