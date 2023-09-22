package Interface;

import java.util.Scanner;

public class Students implements Test0,Maths{
	@Override
	public  void test1() {
		System.out.println("My first Method");
	}

	@Override
	public void addition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void substraction() {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int a1=sc1.nextInt();
		int b1=sc1.nextInt();
		int c1=a1-b1;
		System.out.println(c1);
		
	}

	@Override
	public void multiplication() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter The numbers :");
		double a2= sc2.nextDouble();
		double b2=sc2.nextDouble();
		double c2=a2*b2;
		System.out.println(c2);
				
		
		
	}

	@Override
	public void division() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		float a3=sc3.nextFloat();
		float b3=sc3.nextFloat();
		float c3=a3/b3;
		System.out.println(c3);
		
		
	}

	@Override
	public void test2() {
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the String value  :");
		String s=cs.nextLine();
		String s1=cs.nextLine();
		if(s==s1) {
			System.out.println("Its not correct String ");
		}
		else {
			System.out.println(s.length());
			System.out.println(s1.charAt(4));
		}
		
	}

	@Override
	public void test3() {
		int x=0;
		int y=1;
		int z;
		System.out.print(x + ""+ y);
		for(int i=1;i<8;i++)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
		
	}
	public static void main(String[]args) {
		Students s=new Students();
		s.addition();
		s.division();
		s.multiplication();
		s.substraction();
		s.test1();
		s.test2();
		s.test3();
		
	}
	

}
