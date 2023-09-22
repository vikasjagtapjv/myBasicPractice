package JavaProject;
import java.util.Scanner;

public class Sum_avg {
	public static void main(String[]args) { 
		double a,b,c;
		System.out.println(" Average of two numers ");
		Scanner in = new Scanner(System.in);
		System.out.println(" The value of a is: ");
		a=in.nextDouble();
		System.out.println(" The value of b is: ");
		b=in.nextDouble();
		 c=((a+b)/2.0);
	
		 System.out.println(" The average is: "+ c);
		 
		
	}

}
