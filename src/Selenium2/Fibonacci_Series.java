package Selenium2;

public class Fibonacci_Series {
	public static void main(String []args) {
		int a=0;
		int b=1;
		int c;
		System.out.print(a +" "+ b);
		for(int i=1;i<10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			/*
			 * first declare the i value
			 * check the condition
			 * if condition is true then  its comes inside for loop body
			 * then assign the a & b value in the c
			 * Then we print the c value
			 * After that we replace the value of a with b & b in place of c
			 * Once it over 
			 * then comes to the increament operator
			 * i value is increased by 1
			 * then check the condition 
			 * it will continue till the condition false
			 * concentraton is loosen
			 * focus of loop comes outside the body
			 */
			
		}
	}

}
