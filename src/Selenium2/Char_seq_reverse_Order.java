package Selenium2;

public class Char_seq_reverse_Order {
	public static void main(String[]args) {
		//split
		String s="         This is a practice batch";
		String [] sp=s.split("a");
		System.out.println(sp[0]);
		System.out.println(sp[3]);
		int l=s.length();
		System.out.println(l);
		
		//trim() method
		System.out.println(s.trim());
		System.out.println("_______________________________");
		
		//print the char in sequence
		String a="This a Insightinfy";
		int len=a.length();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.println(a.charAt(i));
		}
		System.out.println("__________________________________");
		//reverse the sequence
		for(int i=len-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		
	}

}
