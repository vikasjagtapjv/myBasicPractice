package Multilevel_inheritance;

public class Father extends GrandFather {
	public void gold() {
		System.out.println("Father has Gold");
	}
	public static void main(String[]args) {
		Father Property= new Father();
		Property.land();
		Property.bunglow();
		Property.gold();
		
	}

}
