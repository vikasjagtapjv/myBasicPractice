package Selenium;

interface Test67{
	int a=10;////static final
	void Displayed();// Abstract public
}

interface Test670{
	int s=10;//static final
	int b=43;
	int c=s+b;
	void Shown();// Abstract public
}
 class Test4{
	public void shows1() {
		System.out.println("Done");
	}
	
}

public class classB extends Test4 implements Test67,Test670 {
	public void Displayed()
{
	System.out.println(a);
}
	public void Shown() {
		System.out.println(c);
	}
	

public static void main(String[]args)
{
	classB ew = new classB();
	ew.Displayed();
	ew.Shown();
	ew.shows1();
}
}