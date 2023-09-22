package JavaProject;

public class Arms {

	public static void main(String[] args) {
		
int a,n,c=0;
 n = 153;
int temp = n;
while(n>0)
{
	a=n%10;
	n=n/10;
	c=c+(a*a*a);
}
if(temp==c)
{
	System.out.println("Its armstrong number");
}
else
{
	System.out.println(" Not ok");
}

	}

}
