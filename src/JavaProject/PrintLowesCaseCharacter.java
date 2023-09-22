package JavaProject;

public class PrintLowesCaseCharacter {
public static void main(String[] args) {
	String s="Its Simple";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isLowerCase(c))
		{
			System.out.print(c);
		}
	}
}
}
