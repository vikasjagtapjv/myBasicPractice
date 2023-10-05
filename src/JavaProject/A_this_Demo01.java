package JavaProject;
//this keyword is used to invoking the current class method
public class A_this_Demo01 {
	//The this keyword is used to invoke the constructors of the current class. 
	//Suppose a class has two constructors: no-argument and parameterized constructors.
	
	
	//simple constructor
	A_this_Demo01()
	{
		this(23);
	}
	//Parameterized Constructor
	A_this_Demo01(int a)
	{
		System.out.println("current class parameterized construcor invoked");
		System.out.println("Number is :"+a);
	}
	
	//current class method
	void test01()
	{
		System.out.print("My Name is ");
	}
	void test02()
	{
		//invoking current class "test01" method
		this.test01();
		System.out.print("Vikas");
		
	}
	
	

}
