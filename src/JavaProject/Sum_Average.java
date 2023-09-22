package JavaProject;
import java.util.Scanner;
public class Sum_Average {
	public static void main(String[]args) {
		int a,b,sum;
		float f;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number ");
		a = sc.nextInt();
		System.out.println(" Enter Second Number ");
		b = sc.nextInt();
		sum =a+b;
		f=(float)((a+b/2));
		System.out.println("Sum:" + sum + " \nAverage: " + f);
	}

}
