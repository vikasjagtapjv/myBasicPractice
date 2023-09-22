package JavaProject;

public class CountUpperCaseCharacters {
public static void main(String[] args) {
	String s="Its Simple";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isUpperCase(c))
		{
			count++;
		}
	}
	System.out.println(count+" Upper count");
}
}
