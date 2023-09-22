package JavaLogicalProblem;

import org.testng.annotations.Test;

public class Reverse_String {
	@Test(priority=0)
	public void test0(){
		//using + ( String concatenation) operator
		String str="Hell java";
		String rev="";
//		for(int i=0;i<str.length();i++)
//		{
//			char c=str.charAt(i);
//			rev=c+rev;
//			
//		}
//		System.out.println(rev);
		
		//logic 02:Using String builder
//		StringBuilder sbr=new StringBuilder();
//		sbr.append(str);
//		StringBuilder s=sbr.reverse();
//		System.out.println(s);
		//logic 03:using StringBuilder class
//		StringBuffer sb=new StringBuffer(String.valueOf(str));
//		StringBuffer s=sb.reverse();
//		System.out.println(s);
		
		//logic 04:By using CharArray
		for(int i=0;i<str.length();i++)
		{
			char c[]=str.toCharArray();
			rev=c[i]+rev;
			
		}
		System.out.println(rev);
	}
	@Test(priority=1)
	public void test1() {
		String s="Hello java";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
			
		}
		System.out.println(rev);
	}
	@Test(priority=2)
	public void test2()
	{
		String s="Hello all";
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(s);
		rev=sbl.reverse();
		System.out.println(rev);
				
	}
	@Test(priority=3)
	public void test3()
	{
		String s="Hello all";
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(s));
		rev=sb.reverse();
		System.out.println(rev);
	}
	@Test(priority=4)
	public void test4()
	{
		String s="Hello Vikas";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char [] c=s.toCharArray();
			rev=c[i]+rev;
		}
		System.out.println(rev);
		
	}
	@Test(priority=5)
	public void test5()
	{
		String s="viraj";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	
	
	}
	@Test(priority=6)
	public void test6() {
		String s="Vinita";
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(s));
		rev=sb.reverse();
		System.out.println(rev);
	}
	@Test(priority=7)
	public void test7() {
		String s="Jagtap";
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(s);
		rev=sbl.reverse();
		System.out.println(rev);
	}
	@Test(priority=8)
	public void test8()
	{
		String s="Vikas";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char [] c=s.toCharArray();
			rev=c[i]+rev;
		}
		System.out.println(rev);
	}
	@Test(priority=9)
	public void test9() {
		String s="Vikas jagtap";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}
	@Test(priority=10)
	public void test10() {
		String s="Viraj";
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(s));
		rev=sb.reverse();
		System.out.println(rev);
	
	}
	@Test(priority=11)
	public void test11() {
		String s="rony";
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(s);
		rev=sbl.reverse();
		System.out.println(rev);
		
		
	}
	@Test(priority=12)
	public void test12()
	{
		String s="viraj";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char[] c=s.toCharArray();
			rev=c[i]+rev;
		}
		System.out.println(rev);
	}
	@Test(priority=13)
	public void test13() {
		String s="Viraj";
		String rev="";
		for(int i=0;i<s.length();i++)
		{	
			char c=s.charAt(i);
			rev=c+rev;
			
		
		}
		System.out.println(rev);
		
		}
	@Test(priority=14)
	public void test14() {
		String s="vikas";
		StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(s));
		rev=sb.reverse();
		System.out.println(rev);
	}
	@Test(priority=15)
	public void test15() {
		String s="Vinita";
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(s);
	
		rev=sbl.reverse();
		System.out.println(rev);
		
		
	}
	@Test(priority=17)
	public void test17()
	{
		String s="Hi hello";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char[] c=s.toCharArray();
			rev=c[i]+rev;
		}
		System.out.println(rev);
	}
	
	
	
	
	

}
