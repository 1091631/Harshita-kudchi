package javastring;

public class Hello_String {

	public static void main(String[] args) { 
		
			String s = "Hello how are you";
				int c =0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == ' ')
					c++;
			}
			System.out.println("Total number of words: "+ ++c);
			
			}
		}


	


