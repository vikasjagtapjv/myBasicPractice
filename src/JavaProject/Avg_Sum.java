package JavaProject;
import java.util.Scanner;
public class Avg_Sum {
	public static void main(String[]args) {
		double a,b,sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		a= sc.nextDouble();
		System.out.println(" Enter Second Number:");
		b = sc.nextDouble();
		// Calculate sum & avg
		sum= ((a+b/2.0));
		 
		
		System.out.println("Sum:" +sum);
		//System.out.println( "Average:" + avg );
	}

}
