package JavaProject;

public class RightSidedTriangle {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++) 
			{
				System.out.print("  ");//here should be double space
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");//here should be right side single space
			}
			System.out.println();
		}
		/*
		 * Execution process
		 *  when i=1,
		 *  upper nested first loop execute
		 *  and print 5 spaces
		 *  then in same row then it will enter the second 
		 *  nested row and print 1 star;
		 *  again repeat the cycle till loop false
		 */
		
	}

}
