package June212023;




 interface Test001 {
	int a=24;
	int b=54;
	void look();
	
}
 interface Test002{
	 String a1="Ram";
	 String b1="Sita";
	 void watch();
	 
 }
 class Test003{
	 public void Watched() {
		 System.out.println("VIRAJ "+" VINITA");
	 }
 }

public  class Interface01 extends Test003 implements Test001,Test002 {
	public void look() {
		System.out.println(a);
		System.out.println(b);
		
	}
	public void watch() {
		System.out.println(b1+a1);
		System.out.println(a1);
		
	}
	public static void main(String[] args) {
		
		Interface01 inter=new Interface01();
		inter.look();
		inter.watch();
		inter.Watched();
				
	}
	

}
