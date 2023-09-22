package Selenium2;

public class String_compare {
	public static void main(String[]args) {
		String s1="WELCOME";
		String s2="Welcome";
		if(s1==s2) {
			System.out.println("Both the String values are Same");
		}
		else {
			System.out.println("Both the String values are not same");
		}
		System.out.println("_______________________________________________");
		String a="This is practice batch";
		String a1="THIS IS PRACTICE BATCH";
		System.out.println("a not equal to a1 : "+a.equals(a1));
		System.out.println("a equal to a1 : "+a.equalsIgnoreCase(a1));
	}

}
