package javastring;

public class MKGandhi {
	
	public static void main(String[] args) {
		String s="Mahatma Karamchand Gandhi";
		String s1=" ";
		String s2=" ";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(i==0)
			{
				System.out.print(s.charAt(i) +" . ");
			}
			if(ch ==' ')
			{
				System.out.print(s.charAt(i+1) +" . ");
				
				
			
		}
		
		
		if(ch ==' ')
			break;
		
		}
	System.out.print(s.substring(19));
}
}
