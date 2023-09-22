   package Selenium1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNg7 {
@Test
public void a() {
	System.out.println("A test method");
	
}
//industry mostly used this 
@Test(enabled=false)
public void b() {
System.out.println("B Test method");
}
//Test case will execute two times
@Test(invocationCount=2)
public void c() {
	System.out.println("C Test method");
}
//Test case will execute 0 times.test case will skip
@Test(invocationCount=0)
public void d() {
	System.out.println(" D Test method");
}
// Crrect way but it is not recommended 
@Test 
public void e()
{
	System.out.println("E test method");
	throw new SkipException("skipped method");
}
}