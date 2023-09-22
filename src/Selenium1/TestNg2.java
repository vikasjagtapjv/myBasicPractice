package Selenium1;

import org.testng.annotations.*;

public class TestNg2 {
	@Test
	public void a() {
		System.out.println("its @test");//5
	}
	@BeforeMethod
	public void b() {
		System.out.println("Its @Before");//4
	}
     @AfterMethod
     public void c() {
	System.out.println("Its after method");//6
}
     @BeforeClass
     public void d() {
    	 System.out.println("Its before class");//3
     }
     @AfterClass
     public void e() {
    	 System.out.println("Its after class");
    		 //7
    	 }
     @BeforeGroups
	 public void f() {
		 System.out.println("Its Before group");
    	 
     }
     @AfterGroups
     public void g() {
    	 System.out.println("Its After group");
    	 
     }
     @BeforeSuite
     public void h() {
    	 System.out.println("Its Before Suit");//1
     }
     @AfterSuite
     public void i() {
    	 System.out.println("Its after suit");//9
    	 
     }
     @BeforeTest
     public void j() {
    	 System.out.println("Its before test");//2
    	 
     }
     @AfterTest
     public void k() {
    	 System.out.println("Its after test");//8
    	 
     }
     @Test
     public void l() {
    	 System.out.println("Its another test case");
     }
}
