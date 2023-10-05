package JavaLogicalProblem;

import org.testng.annotations.Test;

public class LongestWordInString {
	//@Test(priority=0)
	public void test()
	{
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
	@Test(priority=1)
	public void test1()
	{
		String s="India is my country";
		s=s+" ";
		String word=" ";
		String lgw=" ";
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c !=' ')
			{
				word=word+c;
			}
			else {
				if(word.length()>lgw.length()) 
				{
					lgw=word;
					}
				word="";
			}
			
		}
		System.out.println(lgw);
	}
	
	

}
