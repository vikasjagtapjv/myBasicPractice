  package JavaProject;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5432;
int r;
int s=0;
while(n!=0)
{
	r=n%10;
	s=(s*10)+r;
	n=n/10;
}
System.out.println(s);
	}

}
