package Interface;

import java.util.Random;

public class Logical_Prob implements Logical_Problems {
	public void reverseString() {
		String s="VINITA";
		String emp=" ";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			emp=emp+s.charAt(i);
		}
		System.out.println("String Reversed :"+emp);
	}
	public void randomNumber() {
		//by using Math.random() method we are generating the 
		// random number
		double a=Math.random()*200;
		System.out.println(a);
		System.out.println("_______________________________");
		
		
		//We are generating the random number by using Random 
		//class also 
		// Firstly we are creating the oblect of random class 
		Random random =new Random();
		int r=random.nextInt();
		double s=random.nextDouble();
		float f=random.nextFloat();
		long l=random.nextLong();
		System.out.println(r+" "+s+" "+f+" "+l);
		System.out.println("_______________________________");
		
		// we also generate the random number by using for loop
		for (int i=1;i<=10;i++) {
			System.out.println((int)(Math.random()*200));
		}
		
		
	}
	public void fibonacciSeries() {
		int a=0;
		int b=1;
		int c;
		int n=8;
		System.out.print(a+" "+b);
		for (int i=1;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
	public static void main(String[]args) {
		System.out.println(Logical_Problems.c);
		Logical_Prob l=new Logical_Prob();
		l.reverseString();
		l.randomNumber();
		l.fibonacciSeries();
		
	}

}
