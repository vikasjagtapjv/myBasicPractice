package Selenium2;

public class Multidimentional_Array {
	public static void main(String[]args) {
		/*
		 * Data store in rows & column
		 * To access the element by using row & column index number
		 * 
		 * Declaration
		 * datatype[][] arrayRefVar;
		 * datatype arrayRef/var[][];
		 * eg:int [][]a;
		 * eg:int a[][];
		 * instantiation
		 * arrayRefVar=new dataType[row Sizw][column size];
		 * 
		 * Combine Declaration & Instantiation in one Statement
		 *  datatype [][]arrayRefValue=new datatype[Row Size][column size];
		 *  datatype [][]arrayRefValue={{1,2,3},{2,3,4},{8,5,4}};
		 *  
		 *  Declare and intantiate array
		 */

		int a[][]=new int[3][2];// 3 rows & 2 columns
		 // now insert vaue in array
		a[0][0]=12;//row=0,column=0;
		a[0][1]=13;//row=0,column=1;
		 
		a[1][0]=14;//row =1,column=0;
		a[1][1]=15;//row=1,column=1;
		
		a[2][0]=16;//row=2,column=0;
		a[2][1]=17;//row=2,column=1;
		
		// Now Print the size of Rows and Column
		System.out.println("number of Rows :"+a.length);//number of rows
		System.out.println("number of columns :"+a[1].length);// Number of columns
		
		//
		
		int a1[][]= {{12,13,45},{14,15,27},{16,18,23},{12,23,14}};//{12,13} This is first row in 
		//two values are nothing but (12&13) column 1& column 3.
		
		// Now again print the size of rows & column
		System.out.println("Num.of  Rows :"+a1.length);
		System.out.println("Num. of col. :"+a1[0].length);
		
		for (int i=0;i<a1.length;i++)//0,1,2,3
			//a1.length by using this notaion we find out the length of the row ,here length of the row is 3
		{
			for(int j=0;j<a1[0].length;j++) //0,1,2
			{
				//a1[0].length by using this notation we find out length of the column
				System.out.println(a1[i][j]);//12,13,45
			}
		}
		
		
}
}

