package Polymorphism;

public class Method_Overriding extends Parent {
	public void store(int a,double b) {
		double c;
		c=a*b;
		System.out.println(c);
		
	}
	public static void main(String[]agrs) {
		Method_Overriding mod=new Method_Overriding();
		mod.store(24, 26);
		mod.store(36, 12);
	}

}
