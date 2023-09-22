package JavaLogicalProblem;

import java.util.Scanner;

import org.apache.batik.apps.rasterizer.Main;
import org.testng.annotations.Test;

public class DemoPalindrome {
	//@Test(priority=0)
	public void test0(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 int num=sc.nextInt();
		 int orgNum=num;
		 int rev=0;
		 while(num>0)
		 {
			 rev=rev*10 +num%10;
			 num=num/10;
			 
		 }
		 if(orgNum==rev) {
			 System.out.println(orgNum+" Its palindrome number");
		 }
		 else
		 {
			 System.out.println("Its not palindrome");
		 }
		
		
		
	}
	@Test(priority=1)
	public void test1() {
		int num=164461;
		int orgNum=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		if(orgNum==rev)
		{
			System.out.println("Its palindrome number "+orgNum);
		}
		else
		{
			System.out.println("Its not palindrome "+orgNum);
		}
	}
	@Test(priority=2)
	public void test2()
	{
		int num=121;
		int reverse=0;
		int orgNum=num;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its palindrome number");
		}
		else
		{
			System.out.println(orgNum+" Its not palindrome number");
		}
		
	}
	@Test(priority=3)
	public void test3()
	{
		int num=121;
		int reverse=0;
		int orgNum=num;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
			
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+ " Its palindrome");
			
		}
		else
		{
			System.out.println(orgNum+ "Its not palindrome ");
		}
	}
	@Test(priority=4)
	public void test4()
	{
		int num=123321;
		int orgNum=num;
		 int reverse=0;
		 while(num>0)
			 
		 {
			 reverse=reverse*10+num%10;
			 num=num/10;
			 
		 }
		 if(orgNum==reverse)
		 {
			 System.out.println(orgNum+ " its Palindrome number");
		 }
		 else
		 {
			 System.out.println(orgNum+" Its not palindrome");
		 }
	}
	@Test(priority=5)
	public void test5() {
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+ " its palindrome number");
		}
		else
		{
			System.out.println(orgNum+ " Its not palindrome number");
		}
	}
	@Test(priority=6)
	public void test6() {
		int num=121;
		int orgNum=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgNum==rev)
		{
			System.out.println(orgNum+" Its palindrome number");
		}
		else
		{
			System.out.println(orgNum+" Its not palindrome number");
		}
	}
	@Test(priority=7)
	public void test7() 
	{
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
			
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its palindrome number");
		}
		else 
		{
			System.out.println(orgNum+" Its not palindrome number");
		}
	}
	@Test(priority=8)
	public void test8()
	{
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its test8 palindrome number");
		}
		else
		{
			System.out.println(orgNum+" Its test8 not a palindrome number");
		}
	}
	@Test(priority=9)
	public void test9()
	{
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+"Its test9 palindrome number");
		}
		else
		{
			System.out.println(orgNum+" Its not palindrome number");
		}
	}
	@Test(priority=10)
	public void test10() {
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Palindrome10");
			
		}
		else
		{
			System.out.println(orgNum+" Not palindrome10");
		}
	}
	
	
	

}
