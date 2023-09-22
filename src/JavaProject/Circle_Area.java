package JavaProject;
import java.util.Scanner; 

public class Circle_Area {
	public static void main(String[]args) {
		double a,b;
		Scanner in = new Scanner(System.in);
		System.out.println(" the radius is : ");
		a= in.nextDouble();
		b=Math.PI*a*a;
		System.out.println(" The area of circle is: "+b);
	}

}
