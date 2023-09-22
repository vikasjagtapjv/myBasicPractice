package JavaProject;

public class Remove_All_spaces_From_String {
	public static void main(String[] args) {
		String s1="";
		String s="No26 Sound";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				s1=s1+c;
			}
		}
		System.out.print(s1);
	}

}
