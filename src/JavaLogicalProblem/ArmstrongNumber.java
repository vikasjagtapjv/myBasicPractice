package JavaLogicalProblem;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ArmstrongNumber {
	//@Test(priority=0)
	public void test0()
	{
		int a,n=153,c=0;
		int t=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=(a*a*a)+c;
		}
		if(t==c)
		{
			System.out.println("Its armstrong number");
		}
		else {
			System.out.println("Its not armstrong number");
		}
		
	}
	//@Test(priority=1)
	public void test1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		int t=num;
		int reminder,c=0;
		while(num>0)
		{
			reminder=num%10;//3,5,1
			num=num/10;//15,1,
			c=(reminder*reminder*reminder)+c;
			
		}
		if(t==c)
		{
			System.out.println("Its palindrome number "+c);
		}
		else
		{
			System.out.println("Its not Palindrome number "+c);
		}
		
	}
	@Test(priority=2)
	public void test2() {
		
		int num=153;
		int orgNum=num;
		int reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its Armstromg number");
		}
		else
		{
			System.out.println(orgNum+" Its not a Armstrong number");
		}
	}
	@Test(priority=3)
	public void test3()
	{
		int num=153;
		int OrgNum=num;
		int reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(OrgNum==reverse)
		{
			System.out.println(OrgNum+"Armstrong number");
		}
		else
		{
			System.out.println(OrgNum+"Not Armstrong Number");
		}
	}
	@Test(priority=4)
	public void test4()
	{
		int num=153;
		int orgNum=num;
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+ " Its Armstrong Number");
		}
		else
		{
			System.out.println(orgNum+ " Its not a Armstrong Number");
		}
	}
	@Test(priority=5)
	public void test5() {
		int num=153;
		int orgNum=num;
		int reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" its Armstrong Number");
		}
		else
		{
			System.out.println(orgNum+" Its Not armstrong number");
		}
	}
	@Test(priority=6)
	public void test6() {
		int num=153;
		int orgNum=num;
		int reverse=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
		System.out.println(orgNum+" Its armstrong Number");
		}
		else
		{
			System.out.println(orgNum+ " Its not armstrong number");
		}
	}
	@Test(priority=7)
	public void test7()
	{
		int num=153;
		int orgNum=num;
		int reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its armstrong Number");
		}
		else
		{
			System.out.println(orgNum+" Its not Armstrong number");
		}
	}
	@Test(priority=8)
	public void test8() {
		int num=153;
		int orgNum=num;
		int reverse=0,reminder;
		while(num>0) 
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
			
			
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" its test8 Armstrong number");
		}
		else
		{
			System.out.println(orgNum+" Its not test8 Armstrong number");
		}
	}
	@Test(priority=9)
	public void test9()
	{
		int num=153;
		int orgNum=num;
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its test9 armstrong number");
		}
		else
		{
			System.out.println(orgNum+" Int test9 not armstrong number");
		}
	}
	
	@Test(priority=10)
	public void test10()
	{
		int num=153;
		int orgNum=num;
		int reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its Armstrong number test10");
		}
		else
		{
			System.out.println(orgNum+" Its not Armstrong number test10");
		}
	}
	
	@Test(priority=11)
	public void test11() {
		int num=153;
		int orgNum=num;
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" Its 11 th test Armstrong number");
		}
		else
		{
			System.out.println(orgNum+" Its not 11th test Armstrong number");
		}
		
	}
	
	

}
