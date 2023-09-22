package JavaLogicalProblem;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeString {
	//@Test(priority=0)
	public void test0(){

	//String s="madam";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Characters");
		String s=sc.next();
		
		String orgString=s;
		String rev="";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
			
		}
		if(orgString.equals(rev))
		{
			System.out.println(orgString+" String is palindrome");
		}
		else {
			System.out.println(orgString+" String is not palindrome");
		}


	}
	@Test(priority=1)
	public void test1() {
		String s="madam";
		String rev="";
		String orgString=s;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		if(orgString.equals(rev))
		{
			System.out.println(orgString+" String is palindrome");
		}
		else 
		{
			System.out.println(orgString+" String is not palindrome");
		}
		
	}
	@Test(priority=2)
	public void test2()
	{
		String s="madam";
		String rev="";
		String orgString=s;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		if(orgString.equals(rev))
			
		{
			System.out.println(orgString+ " String is palindrome");
			
		}
		else
		{
			System.out.println(orgString +" String is not palindrome");
		}
		
	}
	@Test(priority=3)
	public void test3() {
		String s="madam";
		String rev="";
		String orgString=s;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		if(orgString.equals(rev))
		{
			System.out.println(orgString+" String is palindrome ");
		}
		else
		{
			System.out.println(orgString+"String is not palindrome");
		}
	}
	@Test(priority=4)
	public void test4() {
		String s="madam";
		 String orgString=s;
		 String rev="";
		 for (int i=0;i<s.length();i++)
		 {
			 char c=s.charAt(i);
			 rev=c+rev;
		 }
		 if(orgString.equals(rev))
		 {
			 System.out.println(orgString+" String test4 is palindrome");
		 }
		 else
		 {
			 System.out.println(orgString + " String test4 is not palindrome");
		 }
	}

}
