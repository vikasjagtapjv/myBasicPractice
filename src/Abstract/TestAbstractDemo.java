package Abstract;

public class TestAbstractDemo {
	
	public static void main(String[] args) {
		
		Bike b=new TVS();
		b.start();
		b.stop();//non abstract method
		b.run();//Abstract method
		Bike b1=new Yamha();
		b1.start();
		b1.stop();//non abstract method
		b1.run();//Abst
		b1.get();
	Demo01 md=new Demo03();
	md.Vehicle();
	
	}

}
