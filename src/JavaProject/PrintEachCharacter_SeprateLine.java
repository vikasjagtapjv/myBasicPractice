package JavaProject;

public class PrintEachCharacter_SeprateLine {
	public static void main(String[] args) {
		String s="its simple";
		
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
		    System.out.println(c+" "+(int)c);
		}
			
	}

}
