package Interface;

interface A{
	//int numl;//We can't initialize the element here 
	//We need to declare in form of data type as public static final
	 int a1=4;
	void print();
}
public class Interface01 implements A {
	public void print() 
	{
		System.out.println("This is umplemented Method Print");
	}
	public static void main(String[]args)
	{
		//We can not create the object of interface
		// But we create the instance of interface
		A a=new Interface01();
		a.print();
		System.out.println(A.a1);
	}

}
