package Aug15th;

public class Sample {
	public static void main(String[] args) {
		String s="Password : admin123";
		s.substring(s.indexOf('a'),s.length()-1);
		//s.indexOf(0, 0)
		System.out.println(s.replace(':', ' '));
		String s1=s.replace(':', ' ');
		System.out.println();
		String s2=s1.substring(s1.indexOf(' '));
		String s3="";
		for (int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(!Character.isWhitespace(c))
			{
				s3+=c;
			}
		}
		System.out.println(s3);
		
		
		int n=4;
		int n1=0;
		int div=n/n1;
		System.out.println(div);
	}

}
