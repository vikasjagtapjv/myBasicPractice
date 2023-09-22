package JavaProject;

class G
{
	int age = 26;
	public void msg()
	{
		System.out.println(" Error handling coverage ");
	}
	
}
class H extends G
{ 
	double height = 170;
	public void empty()
	{
		System.out.println(" I am totally empty");
	}
}





public class Single_inheritan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H j = new H();
		j.msg();
		System.out.println(j.age);
		j.empty();
System.out.println(j.height);
	}

}
