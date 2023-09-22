package JavaLogicalProblem;

import org.testng.annotations.Test;

public class Count_Vowels {
	//@Test(priority=0)
	public void test0() {
	String s="Hey Everone";
	int count=0;
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
			System.out.print( " "+ c + " ");
		}
	}
	System.out.println(count);
	}
	@Test(priority=1)
	public void test1()
	{
		String s="a ev ion uUno";
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				System.out.println(" "+c+" ");
			}
			
		}
		System.out.println(count);
	}
	@Test(priority=2)
	public void test2()
	{
		String s="Hi everyone ";
		int count =0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				System.out.println(" "+c+" ");
			}
		}
		System.out.println(count);
	}
	@Test(priority=3)
	public void test3() {
		String s="Hi Everyone";
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				System.out.println(" "+c+" ");
			}
		}
		System.out.println(count);
	}
	@Test(priority=4)
	public  void test4() {
		String s="Hi HOw are you";
		int count=0;
		s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				System.out.println(" "+c+" " );
			}
		}
		System.out.println(count);
	}

}
