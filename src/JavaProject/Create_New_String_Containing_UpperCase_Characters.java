package JavaProject;

public class Create_New_String_Containing_UpperCase_Characters {
	public static void main(String[] args) {
		
		String s="Its Simple";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

}
