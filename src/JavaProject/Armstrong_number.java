package JavaProject;
import java.util.Scanner;
public class Armstrong_number {
	public static void main(String[]args) {
		int a,n,c,temp;
		//n=153;
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the armstrong number: ");
		n=in.nextInt();
		temp=n;
		c=0;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println(" It is armstrong number");
			
			
		}
		else {
			System.out.println(" It is not armstrong number");
		}
		
		
	}

}
