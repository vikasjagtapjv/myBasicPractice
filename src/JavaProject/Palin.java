package JavaProject;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,n,s=0;
n=121;
int temp =n;
while(n>0)
{
	a=n%10;
	n=n/10;
	s=(s*10)+a;
	
	
}
if(temp==s)
{
	System.out.println(" Its palindrome number");
}
else
{
	System.out.println(" Not palindrome number");
}
	}

}
