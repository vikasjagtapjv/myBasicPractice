package Selenium1;

import org.testng.annotations.Test;

public class TestNg6 {
	@Test(priority=-10)//2
	public void a() {
		System.out.println("A test method");
		
	}
	@Test(priority=15)//6
	public void a1() {
		System.out.println("A1 test method");
		
	}
	@Test()
	public void b2() {
		System.out.println("B2 test method");
		
	}
	@Test(priority=-10)//3
	public void a3() {
		System.out.println("A3 test method");
		
	}
	@Test(priority=20)//7
	public void a4() {
		System.out.println("A4 test method");
		
	}
	@Test()
	public void a5() {
		System.out.println("A5 test method");
		
	}@Test(priority=10)//4
	public void a6() {
		System.out.println("A6 test method");
		
	}
	@Test(priority=-20)//1
	public void a7() {
		System.out.println("A7 test method");
		
	}
	@Test(priority=10)//5
	public void a8() {
		System.out.println("A8 test method");
		
	}
}
