package Statickeywords;

public class Char_int {
	char i='n';
	public void stringmethods()
	{
		int s=Character.getNumericValue(i);
		System.out.println(s);
	}
	public static void main(String[]args)
	{
		Char_int obj = new Char_int();
		obj.stringmethods();
	}

}
