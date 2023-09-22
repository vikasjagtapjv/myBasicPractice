package RepeatGetup;

public class reverseString {
	public static void main(String[] args) {
		
	
	String s ="Vikas";
	String rev="";
	int len=s.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println("   Reversed string  "+rev);
	
	}
	

}
