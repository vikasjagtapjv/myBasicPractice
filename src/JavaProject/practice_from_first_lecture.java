package JavaProject;

public class practice_from_first_lecture {
// when variable declared here called global variable
	public static void main(String[] args) {// call that jvm
		//  when variable declared here called local variable
		byte s = 127;//8bit( 1 byte = 8bits)
		System.out.println(s);
		short w = 78;//16bit s
		System.out.println(w);
		int a =43;//32bits
		System.out.println(a);
		float r = 98.3f;// 32bits(1.25)
		System.out.println(r);
		long l = 12;//64bits
		System.out.println(l);
		double d = 87.43;//64bits
		System.out.println(d);
		char c = 'a';//16bits
		System.out.println(c);
		boolean b = true;//1bits
		System.out.println(b);
		// Swapping two numbers by using arithmetic operator
		int a1 = 45;
		int b1 = 35;
		 a1= a1+b1;
		 b1=a1-b1;
		 a1= a1-b1;
		 System.out.println("current valuue of " + a1);
		System.out.println("current value of" + b1);
//logical AND(&&)-bitwise AND(&)
		int a3 = 10;
		int b3 = 5;
		int c3 = 20;
		
		//Logical-its check only one condition,if first condition is false
		System.out.println(a3<b3 && a3<c3);
		//bitwise-its check both condition, if first condition
		System.out.println(a3<b3 & a3<c3);
		
		//Logical
		System.out.println(a3<b3 && a3++<c3);
		System.out.println(a3);
		
		//bitwise
		System.out.println(a3<b3 & a3++<c3);
		System.out.println(a3); 
		
		System.out.println("Unary operator");
		// Unary operator
		int q = 10;
		int e = 10;
		System.out.println(--q+e);//9-9,10
		System.out.println(q++ );//9,10
		System.out.println(++q - --e);//11-11,9-9
		System.out.println(q>e);
		System.out.println(q++ + e++);//11-12,9-10
		System.out.println(q++);//12-13
		System.out.println(e++);//10-11
		System.out.println(++e);//12
		System.out.println(++q);//14
		System.out.println(--q);//13
		System.out.println(--e);//11
		 
		//Relational operator
		System.out.println("Relational operator");
		int age = 30;
		//int h =300;
		 if (age <=30)
		 {
			 System.out.println(" you can drive");
			 
		 }
		 else
		 {
			 System.out.println(" you cant drive");
		 }
		
		 //Assignment Operator
		 System.out.println("Assignment operator");
		   
		 int ram = 10;
		ram+=3;
		 System.out.println(ram);//ram = ram +3
		 ram-=4;
		 System.out.println(ram);
		 ram*=2;
		 System.out.println(ram);
		 ram/=2;
		 System.out.println(ram);
		 
		 //Ternary operator
		 System.out.println("Ternary operator");
		 
		 int number = 80;
		 String output = (number%2==0) ? "even" : "odd";
		 System.out.println(output);
		 
		 String output1 =(number*4<=96) ? "Not ok"  : "ok";
		 System.out.println(output1);
		 
		 String output2 =(number*4>=96) ? " ok"  : "Not ok";
		 System.out.println(output2);
			
				 //String Comparison
		 System.out.println("String Comparison ");
		 
		 String s1 = "INSIGHT INFY";
		 String s2 ="insight INFY";
		  
		 if(s1.equalsIgnoreCase(s2)) {
			 System.out.println("this is correct");
		 }
		 else {
			 System.out.println("this is incorrect");
		 } 
		/* public static void  Amethod()
		 {
			 System.out.println(" It is A method ");
		 }
		 public static void  Bmethod()
		 {
			 System.out.println(" It is B method ");
		 }

		 
		 public static void main(String[] args) {
			 
				 
			 Amethod();
			 Bmethod();
		 */
				 
				System.out.println(" control statement   05/04/2022 ");
				// if  else statement (here question ask on that)
				int aar= 10;
				int rae = 20;
				if (aar>rae)
				{
					System.out.println("a is greater than");
				}
				else
				{
					System.out.println(" work here");
				}
				 
				  System.out.println(" nested if statement"); 
				  //apply condition 
				   int age1 = 19;
				 int weight = 50;
				  if (age1>=18)
					  
				  {
					  if (weight >=50)
				  
					  
				  {
					  System.out.println(" You are  eligible to donate blood");// inner if body 
				  }
					  else
					  {
						   System.out.println(" You are not elogible");// inner  else body
					  }
				 
		 
				  }
		
		
		


		
		
	}

}
