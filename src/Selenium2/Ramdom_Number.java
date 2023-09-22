package Selenium2;

import java.util.Random;

public class Ramdom_Number {
	public static void main(String[]args) {
		//int min=100;
		//int max=200;
		//By using Math.random() method genrating the random number
		double a=Math.random()*200;
		System.out.println(a);
		System.out.println("____________________________________________________");
		
		//By using "Random" class
		Random random=new Random();
		 int r=random.nextInt();
		 System.out.println(r);
		 float f=random.nextFloat();
		 System.out.println(f);
		 double d=random.nextDouble();
		 System.out.println(d);
		 long l=random.nextLong();
		 System.out.println(l);
		 
		 System.out.println("________________________________________________________");
		 // by using for loop with random method
		 for(int i=1;i<=10;i++) {
				System.out.println((int)(Math.random()*50));
		 }
		 
		 
	}
}


