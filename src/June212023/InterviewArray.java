package June212023;

public class InterviewArray {
	public static void main(String[]args)
	{
		int a[]= {1,2,3,3};
		//System.out.println(a[0]+a[1]+a[2]);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		System.out.println(sum);
	}

}
