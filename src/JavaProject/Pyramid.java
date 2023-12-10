package JavaProject;

public class Pyramid {
	
	public static void main(String[]args) {
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int l=5;l>5;l--)
			{
				System.out.println(" ");
			}
			 
			System.out.println();
		}
	}

}
