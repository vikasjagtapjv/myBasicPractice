package Selenium2;

public class Single_Dimensional_Array {
	public static void main(String[]args) {
		/*
		 * Arrays are used to Store the multiple values in single variable,
		 * instead of declaring seprate variables for each values.
		 * java arrays is an object which contains elements of a similler data 
		 * type.
		 * we can store only similar type of data eg if declare int 
		 * then we can store only integer type of data.we cant store String Or double 
		 * datatype value,all those are should be similar.
		 * Eg:if you want to store the salary of 5 employees
		 * without using array 
		 * int sal1=30000;
		 * int sal2=2100;
		 * int sal3=2890;
		 * int sal4=3000;
		 * int sal5=3400; _ we are creatng the different variables 
		 * By using arrray we are declaring all employees salary in single variable
		 * SYMBOL:int[] salEmp={30000,2100,2890,3000,3400};
		 * Advantages:1-Code Optimizationse can retrive data more efficiently
		 * How to access?
		 * int [] a={10,20,30,40,50};n=5;
		 * When we write above statement in heap memory spaces are allowed
		 * [0],[1],[2],[3],[4].
		 * first block value of index is 0,last index is n-1
		 * When we want access first value ,we are using index to find that value.
		 * Types of array
		 * 1)Single Dimensional array
		 * 2)Multidimensional array
		 * 
		 * 1)Single Dimensional Array:-
		 * lets see ,What we can do in single dimensional array-
		 * Declare & instantiate array 
		 * Insert Value to array
		 * Find the length of array
		 * Read values from array
		 * Change value of an array
		 * Declare & instantiate array :
		 * Declare:
		 * dataType[] arrayRefVar; eg:int[] a;
		 *          OR
		 * dataType arrayRefVar[]; eg:int a[];
		 * Instantiate:
		 * arrayRefVAr=new datatype[Size];a=new int[5];
		 * 
		 * Combine Declaration&instantiation in one Statement
		 * dataType[] arrayRefVar=new datatype[size];
		 * int [] a=new int[5];
		 * dataType[] arrayRefVar={10,20,30,40,50};
		 * int [] a={10,20,30,40,50};
		 *         
		 */
		// Declare& instsntiate the array
		int roll[]=new int [5];
		roll[0]=12;//First Element
		roll[1]=13;//second 
		roll[2]=24;
		roll[3]=23;
		roll[4]=12;
		//print the size of array
		System.out.println("Length of array "+ roll.length);
		
		//Read values from array
		System.out.println("value of 4th Element "+roll[3]);
		//Read all the values of roll array for that we use for loop
		//we use for loop when we know size 
		for(int i=0;i<roll.length;i++) 
		{
			//code to execut
			System.out.println(roll[i]);//12,13,24,23,12
			
			
		}
		System.out.println("_________________________________________");
		int rolls[]= {12,34,23,45,25,23};
		System.out.println("Value of 4th element "+rolls[3]);
		for (int i=0;i<rolls.length;i++)
		{
			System.out.println(rolls[i]);
		}
		System.out.println("__________________________________________");
		
		//by for each loop/Enhanced loop  only initialization
		for(int i:rolls) {
			// 
			System.out.println(i);
			
		}
	}
	
}
