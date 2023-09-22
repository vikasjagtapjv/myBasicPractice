package Polymorphism;

public class Method_Overloading {
	public void fun(int x,int y) {
		int z;
		z=x+y;
		System.out.println(z);
		
		
	}
	public void fun() {
		int a=23;
		int b=24;
		int c=a+b;
		System.out.println(c);
	}
	public void fun(int x,double y) {
		double z;
		z=x+y;
		System.out.println(z);
	}
	public static void main(String[]args) {
		
		Method_Overloading w= new Method_Overloading();
		w.fun(25, 48);
		w.fun();
		w.fun(3, 13);
	
	}

}
