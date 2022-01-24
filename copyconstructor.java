package oopjava;
class CopyMyClass
{
	int i,j;
	CopyMyClass(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("first object i="+this.i);
		System.out.println("first object j="+this.j);
	}
	CopyMyClass(CopyMyClass firstobj) {
		this.i=firstobj.i;
		this.j=firstobj.j;
		System.out.println("Second object i="+this.i);
		System.out.println("Second object j="+this.j);
		
		
	}
}

public class copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyMyClass firstobj=new CopyMyClass(10,20);
		CopyMyClass Secondobj=new CopyMyClass(firstobj);
	}
	}

		

	
