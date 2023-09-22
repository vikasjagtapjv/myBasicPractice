package Multilevel_inheritance;

public class Son extends Father {
	public void bike() {
		System.out.println("Son Modified his Bike");
	}
	public static void main(String[]args) {
		Son prop=new Son();
		prop.bunglow();
		prop.land();
		prop.gold();
		prop.bike();
		
	}

}
