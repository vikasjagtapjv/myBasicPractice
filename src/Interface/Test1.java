package Interface;

public class Test1 implements Test0 {
	@Override
	public void test1() {
		System.out.println("This is First Method");
		
	}

	@Override
	public void test2() {
		System.out.println("this is second Method");
		
		
	}

	@Override
	public void test3() {
		System.out.println("this is Third Method");
		
	}
	public static void main(String[]args) {
		Test1 t=new Test1();
		t.test1();
		t.test2();
		t.test3();
	}
	
	
	

}
