package JavaProject;

public class practice25march {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to lower the string prob 1
		String n = "Jack parker";
		n= n.toLowerCase();
		System.out.println(n);
		
		//prob 2 write java program to replace spaces with underscores.
		String text = "To lower    case";
		text = text.replace(" ", "_");
		System.out.println(text);  
		
		//write a java program to fill in the letter template which looks like below:
		//  letter = "Dear <|name|>, thanks a lot "
		// replace <|name|> with a string (some name)
		
		String letter = "Dear <|name|>, thanks a lot ";
		letter = letter.replace("<|name|>","Harry " );
		System.out.println(letter);
		
		//Write a Java program to detect double and triple spaces in a string.
		String myString = "This string contain double   and triple space";
		int s = myString.indexOf("  ");
		int a = myString.indexOf("   ");
		System.out.println(s);
		System.out.println(a);
		/*Write a program to format the following letter using escape sequence characters.
		Letter = “Dear Harry, This Java Course is nice. Thanks” */
		String myLetter = "Dear Harry \n\tThis Java Course is nice.\n\tThanks!";
		System.out.println(myLetter);
		
	}

}
