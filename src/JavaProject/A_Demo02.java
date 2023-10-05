package JavaProject;

public class A_Demo02 {
	/*The this keyword can be passed as an argument in 
	a method representing an object of a class.
	At industry level it is used in event handlers or at places where we have to provide 
	reference of one class to another class.
*/
	int i=5;
	void test(A_Demo02 obj)
	{
		System.out.println("obj i = "+obj.i);
	}
	void invoke()
	{
	    // "test" method is invoked by passing this as an argument

		test(this);
	}
	
}
