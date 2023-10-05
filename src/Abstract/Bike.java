package Abstract;

public abstract class Bike {
	Bike(int a)
	{
		
		System.out.println("Bike class is created "+ a);
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
	private void mediam()
	{
		System.out.println("Speed should be mediam");
	}
	public void get()
	{
		mediam();
	}
	
}
