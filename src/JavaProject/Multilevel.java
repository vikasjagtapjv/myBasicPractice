package JavaProject;

class Q
{
	void store(int a,double b)
	{
		double c;
		c=a*b;
		System.out.println(c);
	}
	
}
class S extends Q
{
	void shope(int r,double t)
	{
		double c;
	c=r+t;
		System.out.println(c);
	}
}
class P extends S
{
	void mall(int f,double q)
	{
		double c;
		c=f*q;
		System.out.println(c);
	}
}


public class Multilevel {
	public static void main (String[]args) {
		P  ay = new P ();
		ay.mall(12, 23.5);
		ay.shope(10,15);
		ay. store(23,43);
	}

}
