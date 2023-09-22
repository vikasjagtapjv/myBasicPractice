package ArraysPrograms;

import org.testng.annotations.Test;

public class Demo01 {
	@Test
	public void practice()
	{
		//find minimum number& Maximum Number
		int arr[]= {5,12,4,21,8,3,2,7,9,11};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max: "+max);
		System.out.println("min:"+min);
	}
	
	//@Test
	public void printASCIIValue()
	{
		//char arr[]=new char [] {"a","b","c","d","e","f",
			//	"g","h","i","j","k","l","m","n","o","p",
			//	"q","r","s","t","u","v","w","x","y","z"};
		//char arr[]= new char []{'a',bcdefghijk lmnopqrs tuvwxyz};
		char arr[]=new char [] {'A','a','b','c','d','e','f','g','h','j',
				'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+(int)arr[i]);
		}
	}

}
