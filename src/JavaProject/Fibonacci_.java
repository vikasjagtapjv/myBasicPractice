package JavaProject;
import java.util.Scanner;
public class Fibonacci_ {
public static void main(String[]args) {
	/*int a,b,c,i,count=10;
	a=0;
	b=1;
	System.out.println(a+ "  " +b);
	
	for(i=2;i<=10;i++)//
			{
				c=a+b;
				System.out.println(" " + c);
				a=b;
				b=c;
			}*/
	int a,b,c,i,term;
	a=0;
	b=1;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the number");
	
	term = sc.nextInt();
	for(i=2;i<=term;i++)
	{
		System.out.println(" "+a);
		c=a+b;
		a=b;
		b=c;
	}
	
			
}  
}
