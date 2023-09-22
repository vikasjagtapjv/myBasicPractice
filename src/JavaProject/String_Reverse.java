package JavaProject;

public class String_Reverse {
	public static void main(String[] args) {
		String s="Vikas Jagap";
		String rev=" ";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			rev=c+rev;//
			
		}
		System.out.print(rev);
	}

}
