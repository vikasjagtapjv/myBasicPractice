package JavaLogicalProblem;

import org.testng.annotations.Test;

public class StaticVariables {
	int roll;
	String StudentName;
	static String collegeName="Deogiri college";
	/*
	 * only once memory allocate when class loaded
	 *  Static variable are class level
	 *  use for memory management
	 */
	public static void main(String[] args) {
		StaticVariables stu=new StaticVariables();
		stu.roll=101;
		stu.StudentName="rahul";
		System.out.println(stu.roll+","+stu.StudentName+","+stu.collegeName);
		
		StaticVariables stu1=new StaticVariables();
		stu1.roll=102;
		stu1.StudentName="Rajen";
		System.out.println(stu1.roll+","+stu1.StudentName+","+stu1.collegeName);
	}

}
