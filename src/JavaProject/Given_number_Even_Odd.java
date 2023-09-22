package JavaProject;

import java.util.Scanner;

public class Given_number_Even_Odd {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		 int a=sc.nextInt();
		 if(a%2==0)
		 {
			 System.out.println("Given number is even Number");
		 }
		 else
		 {
			 System.out.println("Given Number is Odd Number");
		 }
		
	}

}
