package oopjava;

class Myconstru {
	int i,j,k;
	Myconstru() {
		System.out.println("Inside constructor");
		i=3;
		j=9;
		System.out.println("i="+i+" and j="+j);
		
	}
	Myconstru( int i,int j) {
		this.i=i;
		this.j=j;
	}
	Myconstru( int i,int j,int k) {
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void largestnum() {
		int l=(i>j)?i:j;
		System.out.println("largest number" + l);
	}
	void largestthree() {
		int l=(i>j && i>k)?i:k;
		System.out.println("largest of three number" + l);
	}
}


public class constructor_largestno {

	public static void main(String[] args) {
		Myconstru ob=new Myconstru();
		Myconstru ob1=new Myconstru(1,2);
		Myconstru ob2=new Myconstru(1,2,3);
		ob1.largestnum();
		ob2.largestthree();
		
		
	}

}
