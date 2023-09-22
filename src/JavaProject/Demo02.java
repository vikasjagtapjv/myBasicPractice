package JavaProject;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[]args)
	{
		//Priority of Operators * / % + -
		System.out.println(9+6-3*4/2%5);
		
		//Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :::::::");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:::::::::::");
		int b=sc.nextInt();
		System.out.println("addition of  a and b "+(a+b));
	
	sc.close();
		
	}
	

}
