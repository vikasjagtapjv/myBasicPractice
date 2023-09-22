package Interface;

public interface Test0 {
	//final static int a=34;
	/*
	 * Its Methods are bydefault public abstract void;
	 * variables decared inside the interface are by deafult public
	 * static & final
	 * In java 8 version it support default concrete method()
	 * :default void Methodname();
	 * also support static void concrete method
	 * :static void methodName();
	 * 
	 * In java 9 version it can private void concrete method
	 * :private void methodName();
	 * 
	 * The Methods implements inside the class should compulsory public
	 * Those methods inside interface should compulsory Override inside the class
	 * to achieve interface inside class by using "Implements " Keyword
	 * We can achieve two interfaces inside one class by using implements keyword 
	 * and one superclass properties by using extends keyword;
	 * we cant create the object of interface;
	 * Constructor concept not available inside the interface
	 * interface method not supported to the non abstract methods 
	 * by using interface we can achieve multiple inheritasnce
	 * 
	 *  
	 */
	
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();

}
