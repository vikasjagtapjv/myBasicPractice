package ArraysPrograms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
//	@Test(priority=0)
	public void demo() {
	
		int arr[]= {5,23,34,12,8,2,3,7,8,11};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	@Test(priority=1)
	public void even()
	{
		double sum=1;
		int arr[]= {2,4,3,5,66,88,99,23};
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2==0)//if we put(i%2==0)the we get even index number 
			{
				//sum=sum+arr[i];//sum of all  even numbers
				//0=0+2
				//=2+4,=6+66,=72+88,=160
				sum=sum*arr[i];//multiplication of even number
				//
			}
		}
		System.out.println("Even:"+sum);
	}
//	@Test(priority=2)
	public void odd()
	{
		int arr[]= {2,4,5,6,7,8,37,32,57};
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//				
//		}
		for(int i=0;i<arr.length;i++)
		{
//			if(arr[i]%2!=0)
//			{
//				System.out.println(arr[i]);
//			}
			//print 2 digit number from array
//			if(arr[i]>9&&arr[i]<100)
//			{
//				System.out.println(arr[i]);
//			}
//			if(arr[i]>0)//print positive numbers
//			{
//				System.out.println(arr[i]);
//			}
//			if(arr[i]%5==0)//divisible by 5
//			{
//				System.out.println(arr[i]);
//			}
//			if(arr[i]%10==7)//Ending with 7
//			{
//				System.out.println(arr[i]);
//			}
//			
		}
	}
	

}
