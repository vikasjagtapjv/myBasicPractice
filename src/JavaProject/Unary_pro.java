package JavaProject;

public class Unary_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10;
int b = 10;
System.out.println(++a + ++a);//11-11,12-12,
System.out.println( --b + ++a ); //9-9,13-13
System.out.println( ++a);//14,14
System.out.println( --a);//13
System.out.println(b++);//09-10
System.out.println(a-- - --a );//front end 13 then back end 12,- in front end 11, back end 11
System.out.println( b++ );//10-11,10-11
System.out.println(--b - ++b );//10-10, 11-11
System.out.println(--b - --b);//10-10, 09-09
System.out.println(--b - --a);//08-08, 10-10
System.out.println(--b * ++b );//07-7, 08-08
System.out.println(--b * ++b );//07-7, 08-08

System.out.println( ++a /--b );//11-11,7-7
System.out.println(a);





}

}
