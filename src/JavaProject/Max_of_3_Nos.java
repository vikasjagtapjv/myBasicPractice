package JavaProject;
import java.util.Scanner;
public class Max_of_3_Nos {
	public static void main(String[]args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a=sc.nextInt();
		System.out.println(" Enter b: ");
		b=sc.nextInt();
		System.out.println(" Enter c: ");
		c=sc.nextInt();
		if (a>b&&a>c)
		{
			System.out.println(" a is big number");
		}
		else if (b>a&&b>c)
		{
			System.out.println("b is bigger number");
		}
		else
		{
			System.out.println(" c is bigger number ");
		}
	}

}
