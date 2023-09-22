package Abstract;

public class TestAbstractDemo {
	public static void main(String[] args) {
		Bike b=new TVS();
		b.start();
		b.stop();//non abstract method
		b.run();//Abstract method
	
	}

}
