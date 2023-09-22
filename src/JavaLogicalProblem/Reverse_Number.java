package JavaLogicalProblem;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Reverse_Number {
	//@Test(priority=0)
	public void test0()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		
		//logic First :Using algorithm
//		int rev=0;
//		while(a!=0)
//		{
//			rev=rev*10+ a%10;
//			a=a/10;
//		}
		//logic 02:using stringBuffer class
//		StringBuffer rev;
//		StringBuffer sb=new StringBuffer(String.valueOf(a));
//		rev=sb.reverse();
//		System.out.println("revers the number :"+rev);
		
		//logic 03:using String builder class
		StringBuilder sbl=new StringBuilder();
		sbl.append(a);
		StringBuilder rev=sbl.reverse();
		System.out.println("revers the number :"+rev);
	}
	
	@Test(priority=1)
	public void test1() {
		int num=12345;
		int rev=0;
		while(num>0) {
			rev=rev*10 +num%10;//0+5,5*10+4,54*10+3,543*10+2,5432*10+1=54321
			num=num/10;//1234,123,12,1,0
		}
		System.out.println(rev);
	}
	@Test(priority=2)
	public void test2()
	{
		int num=12345;
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);
	}
	@Test(priority=3)
	public void test3()
	{
		int num=12345;
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		rev=sbl.reverse();
		System.out.println(rev);
	}
	@Test(priority=4)
	public void test4() {
		int num=1234;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	@Test(priority=5)
	public void test5() {
		int num=123456;
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);
		
	}
	@Test(priority=6)
	public void test6()
	{
		int num=123567;
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		rev=sbl.reverse();
		System.out.println(rev);
	}
	@Test(priority=7)
	public void test7()
	{
		int num=12345;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	@Test(priority=8)
	public void test8()
	{
		int num=1234;
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);
	}
	@Test(priority=9)
	public void test9()
	{
		int num=123458;
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		rev=sbl.reverse();
		System.out.println(rev);
	}
	@Test(priority=10)
	public void test10()
	{
		int num=1234;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	@Test(priority=11)
	public void test11() {
		int num=12347;
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);
	}
@Test(priority=12)
public void test12()
{
	int num=123458;
	StringBuilder rev;
	StringBuilder sbl=new StringBuilder();
	sbl.append(num);
	rev=sbl.reverse();
	System.out.println(rev);
	
}
@Test(priority=13)
public void test13()
{
	int num=12345;
	int rev=0;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
}

}
 