package JavaLogicalProblem;

import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Remove_Duplicates_From_String {
	@Test(priority=0)
	public void test0()
	{
		String s="Hi Hello How Are You";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			String c=""+s.charAt(i);
			
			if(result.contains(c))
			{
				continue;
				
			}
			result=c+result;
		}
		System.out.println(result);
	}
	@Test(priority=1)
	public void test1() {
		String s="ABCABCABC";
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
	}
	@Test(priority=2)
	public void test2() {
		
		String s="Hi Hello";
		String result="";
		for (int i=0;i<s.length();i++)
		{
			String c=""+s.charAt(i);
			if(result.contains(c))
			{
				continue;
			}
			result=c+result;//H
		}
		System.out.println(result);
	}
	@Test(priority=3)
	public void test3()
	{
		String s="ABCABCABC";
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
		
		
	}
	@Test(priority=4)
	public void test4()
	{
		String s="ABCABCABC";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			String c=""+s.charAt(i);
			if(result.contains(c))
			{
				continue;//purpose of continue to skip the current iteration
			}
			result=c+result;
		}
		System.out.println(result);
		
	}
	@Test(priority=5)
	public void test5() {
		String s="HI Hello";
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
				
	}
	@Test(priority=6)
	public void test6()
	{
		String s="Hi Hello How Are You";
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
	}
	@Test(priority=7)
	public void test7()
	{
		String s="Hi Hello How Are You";
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
		
	}
	@Test(priority=8)
	public void test8()
	{
		String s="abcabcabcbc";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			String c=" "+s.charAt(i);
			if(result.contains(c))
			{
				continue;//purpose of continue to skip the current iteration
			}
			result=c+result;
		}
		System.out.println(result);

	

	}
	@Test(priority=9)
	public void test9() {
		String s="abcabc abc";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			String c=" "+s.charAt(i);
			if(result.contains(c))
			{
				continue;
			}
			result=c+result;
		}
		System.out.println(result);
	}
	@Test(priority=10)
	public void test10()
	{
		String s="abcabcabcabc";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			String c=""+s.charAt(i);
			if(result.contains(c))
			{
				continue;
			}
			result=result+c;
		}
		System.out.println(result);
	}
	@Test(priority=11)
	public void test11()
	{
		String s="abcabcabcabc";
		Set<Character>set=new LinkedHashSet<Character>();
		for (int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		 }
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
			//sb.reverse();
		}
		System.out.println(sb);
	}
	
	
	

}
