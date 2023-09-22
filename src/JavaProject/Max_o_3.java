package JavaProject;
import java.util.Scanner;
public class Max_o_3 {
	public static void main(String[]args)
	{
	/*int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no a");
		a=sc.nextInt();
		System.out.println("Enter no b ");
		b= sc.nextInt();
		System.out.println("Enter no c ");
		c = sc.nextInt();
		if(a>b && a>c){
			System.out.println(" a is big no");
			
		}
		else if (b>a&& b>c) {
			System.out.println(" b is big no ");
		}
		else {
			System.out.println(" c is big no ");
		} */
		int a,b,c;
		 
		Scanner in  = new Scanner(System.in);
		System.out.println("enter number a: ");
		a=in.nextInt();
		System.out.println("enter number b: ");
		b= in.nextInt();
		System.out.println(" enter number c: ");
		c = in.nextInt();
		if(a>b&&a>c) {
			System.out.println("a is big number ");
			
		}
		else if(b>a&&b>c) {
			System.out.println(" b is bigger number ");
			
		}
		else {
			System.out.println(" c is bigger number ");
		}
		
		
	}

	
}
