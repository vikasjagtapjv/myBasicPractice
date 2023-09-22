package Abstract;

public abstract class Bike {
	Bike()
	{
		System.out.println("Bike class is created");
	}

	//Abstract method created
	abstract void run();
	public void start()
	{
		System.out.println("Bike Started");
	}
	public void stop() {
		System.out.println("Bike Stopped");
	}
	
}
