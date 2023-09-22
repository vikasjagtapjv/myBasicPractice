package JavaProject;

public class Numbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * int i,j,count=0;
		 
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				count++;
				System.out.print(count+ "  ");
			}
			
			System.out.println();
			
			
			
		}
*/
		int i,j,count=0;
		for(i=0;i<=8;i++)//0,1,2,3
		{
			for(j=1;j<=i;j++)// 1,
				{
				count++;
				System.out.print(count+ "  ");
			}
			System.out.println();
		}
	}

}
