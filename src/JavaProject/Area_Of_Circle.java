package JavaProject;
import java.util.Scanner;
public class Area_Of_Circle {
	public static void main(String[]args) {
		double r;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r = in.nextDouble();
		double area = Math.PI*r*r;
		System.out.println("Area of circle is: "+ area);
	}

}
