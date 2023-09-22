package JavaProject;

public class palindrom_Number {
	
	public static void main(String[]args) {
		
		/*
		 * int r,s=0;
		
		int n = 454;
		int t=n;
		while (n>0)
		{
			r=n % 10;
			// =454/10 then remainder is 4now r=4,45/10=5,4/10=4
			s=(s*10)+r;// first we multiply then add r then all result put in S=4,4*10+5=45,45*10+4=454
			
			n=n/10; // first we devoid n/10(454/10) then put result in n=45from here again check in while loop 
			//like (45>0)if condition is true then again go in while loop
			//45/10=4then again check in while loop(4>0)
			//4/10=0then again check in while loop(0>0)-Now condition if false out of while loop
			
		}
		if(t==s)
		{
			System.out.println("Its Palindrom number ");
		}
		else
		{
			System.out.println(" Its not palindrom number ");
		}
		
		
		int re,su=0;
		int nu =434;
		int te =nu;
		while(nu>0)
		{
			re=nu%10;
			su= (su*10)+re;
			nu =nu/10;
			
		}
		if(te==su)
		{
			System.out.println("Its Palindrom number 1 ");
		}
		else
		{
			System.out.println("Its not Palindrom number 1");
		} */
		int r,n,s=0;
		n=434;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=(s*10)+r;
			
		}
		if( t==s)
		{
			System.out.println(" Its palindrom number");
		}
		else {
			System.out.println(" Not palindrom");
		}
	}
	

}
	