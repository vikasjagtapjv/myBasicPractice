package JavaProject;

class A// private 
{
	}

class B// default- access within the package ,can't access outside the package
{
	int r =10;
	void m2() {
		System.out.println(r);
	}
}
 
class C extends B//Protected- accessible within the package and also outside of the package through inheritance.
{ int h= 34;
	void m3(){
		System.out.println(" its ok");
	}
}
// public- access all over the project
public class Access_specier {
	public static void main(String[]args) {
		//A b= new A();
		//b.a =10;//this cannot access outside the class since it is private
		
		//b.m1();//this cannot access outside the class since it is private 
		
		//B g = new B();
		//g.r=10;
		//g.m2();
		C t = new C();
		t.r=10;
		t.h=34;
		t.m2();
		t.m3();
	}

}
