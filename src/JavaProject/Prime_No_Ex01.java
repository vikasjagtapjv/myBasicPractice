package JavaProject;

public class Prime_No_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=50;i++)
		{
			// for logic of scanner-int num = sc.nextint()
			int count = 0;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
		    }
			if(count==0)
			{
				System.out.println(""+i);
			}
		}
	}

}
