package JavaProject;

public class New_String_DigitFirst_Characters {
	public static void main(String[] args) {
		String s1="",r="";
		String s="NO26 Sound";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				s1=s1+c;
			}
			else
			{
				r=r+c;
			}
					
		}
		String add=s1+r;
		System.out.println(add);
	}

}
