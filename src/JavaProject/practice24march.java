package JavaProject;

public class practice24march {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "harry";
int value = s.length();
System.out.println(value);
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.substring(3));
System.out.println(s.substring(1,4));
System.out.println(s.replace('r','p'));
String nonTrimmedString = "   Viky    ";
System.out.println(nonTrimmedString);
String trimmedString = nonTrimmedString.trim();
System.out.println(trimmedString);
System.out.println(s.startsWith("har"));
System.out.println(s.endsWith("har"));
System.out.println(s.charAt(3));
System.out.println(s.indexOf('y'));




	}

}
