package JavaProject;

public class CountLowerCaseCharacter {
	public static void main(String[] args) {
		int count=0;
		String s="Its Simple";
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			{
				if(Character.isLowerCase(c))
				{
					count++;
				}
			}
		}
		System.out.println(count+" Lower case");
	}

}
