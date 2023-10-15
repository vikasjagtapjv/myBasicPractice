package JavaLogicalProblem;

public class Demo {
	public static void main(String[] args) {
		String s="India is country";
		s=s+" ";
		String word=" ";
		String longestWord=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c !=' ')
			{
				word=word+c;//India,is,my,country;
			}
			else 
			{
				if(word.length()>longestWord.length())//5>0=India,2not greater than 0 its not 
					//go inside,simillar to my,7>5
				{
					longestWord=word;//India,country
				
				}
				word="";
		    }
			
		}
		System.out.println(longestWord);
		
	}

}
