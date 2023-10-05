package JavaProject;
/*
 * The this keyword can be used to access and modify the instance and static variables. 
 * Thus, we can change the values of the variables that are declared inside the class 
 * through the this keyword. Also, this keyword can be used to differentiate between 
 * method-specific and class variables.
 */
public class A_this_Keyword {
	int a=5;//here we declared instance variable
	//declaring static variable
	static int b=6;
	public void test()
	{//method variables
		int a=25;
		int b=26;
		//refering current class instance variable and static variable
		this.a=45;
		A_this_Keyword.b=34;
		//printing current class instance and static variable
		System.out.println("The value of instance variable is :"+this.a);
		System.out.println("The value of static variable is :"+A_this_Keyword.b);
		
		//printing the method variables
		System.out.println("method variable01: "+a);
		System.out.println("method variable02: "+b);
	}

}
