package Aug15th;

import org.testng.annotations.Test;

public class Group_Demo0 {
	
		@Test(groups= {"SmokeTest"})
		public void test3() 
		{
			System.out.println("this is my smoke group from demo0");
		}
		@Test
		public void test4() 
		{
			System.out.println("this is my test 4");
		}
		
	}


