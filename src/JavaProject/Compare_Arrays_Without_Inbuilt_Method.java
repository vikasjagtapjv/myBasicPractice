package JavaProject;

public class Compare_Arrays_Without_Inbuilt_Method {
	public static void main(String[]args)
	{
		/*
		 * Rules for compare two arrays
		 * 1)Both the Arrays should same size
		 * 2)Each and every element of Arrays should be equal
		 */
		int a[] = {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		boolean comparision =true;
		if (a.length==b.length) {
			for(int i=0;i<a.length;i++ )
			{
				if (a[i]!=b[i])
				{
					comparision=false;
					break;
				}
			}
		}
		else
		{
			comparision=false;
		}
		if(comparision) {
			System.out.println("Both Arrays are rquals");
		}
		else
		{
			System.out.println("Both Arrays are not equals");
		}
		
		}
	}


