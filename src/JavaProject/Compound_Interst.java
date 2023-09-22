package JavaProject;
import java.util.Scanner;
//The formula for compound interest is p*(1+r/100)^(nt)
// where p is the initial principal balance,r is the interest rate,
//n is the number of times interest is compounded per time and t is number of time periods.
public class Compound_Interst {
	public static void main(String[]args) {
		
		double principal_amount =0.00;
		double interest_rate = 0.00;
		double time_period = 0.00;
		double compound_interest =0.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		principal_amount = sc.nextDouble();
		System.out.println(" Enter the time period in a year: ");
		time_period = sc.nextDouble();
		System.out.println(" Enter the interest rate: ");
		interest_rate = sc.nextDouble();
		
		compound_interest=principal_amount*Math.pow((1+interest_rate/100),time_period);
				System.out.println(" ");
				System.out.println(" Compound interest: " + compound_interest);
		
		
	}

}
