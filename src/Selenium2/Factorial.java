package Selenium2;

import java.util.Scanner;

public class Factorial {
	public static void main(String []args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{ 
			String s=fact +"*"+i;
			fact=fact*i;//1,2,6,
			System.out.println(s+" = "+fact);
		}
		System.out.println("Factorial of "+n+" is "+fact);
		
	}

}
