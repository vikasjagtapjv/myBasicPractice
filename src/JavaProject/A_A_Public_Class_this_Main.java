package JavaProject;

public class A_A_Public_Class_this_Main {
public static void main(String[] args) {
	A_this_Keyword obj=new A_this_Keyword();
	obj.test();
	
	//invoking current class method 
	A_this_Demo01 obj2=new A_this_Demo01();
	obj2.test02();
	// creating an instance of "A_Demo02"
	A_Demo02 obj3=new A_Demo02();
	obj3.invoke();
}

}
