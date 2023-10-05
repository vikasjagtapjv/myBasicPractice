package JavaLogicalProblem;

public class MagicNumber {
	public static void main(String[] args) 
		{
		int num=235;
		while(num>0)
		{
			int sum=0;
			while(num>0)
			{
				int r=num%10;//5,3,2 second condition 0,1
				sum=sum+r;//5,8,10,second condition 0,1
				num=num/10;//23,2,0,second condition 1,0
			}
			num=sum;//first condition=10,second condition =1
		}
		if(num==1)
		{
			System.out.println("Number is magic");
		}
		else
		{
			System.out.println("Number is not magic");
		}
	}

}
