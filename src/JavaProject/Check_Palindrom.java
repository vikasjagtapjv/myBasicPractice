package JavaProject;

//import java.util.Scanner;

public class Check_Palindrom {
	public static void main(String[]args)
	{
		//Scanner sc1=new Scanner(System.in);
		//System.out.println("Enter the Number");//1991
		int n=1991;
		int t=n;
		int r,s=0;
		//Logic for reverse the given number
		while(t!=0)
		{
			r=n%10;//1
			s=(s*10)+r;
			n=n/10;
			
		}
		if (t==s)
		{
			System.out.println("Its Palindrome Number");
		}
		else
		{
			System.out.println("Its not palindrome number");
		}
	}

}
