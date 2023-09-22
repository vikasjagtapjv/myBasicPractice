package JavaLogicalProblem;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Ovels_String {
	@Test(priority=0)
	public void test0()
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0);	 		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character "+ch+" is Consonant");
		      else
			System.out.println("Not an alphabet");	
	}
	@Test(priority=1)
	public void test1()
	{
		String s="Hello Hi How Are You";
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++ ;
				System.out.println(" "+c+" ");
			}
		}
		System.out.println(count);
	}
	

}
