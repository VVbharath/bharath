package Statickeywords;

public class Char_string {
	char i='b';
	public void stringmethods()
	{
		String s=Character.toString(i);
		System.out.println(s);
	}
	public static void main(String[]args)
	{
		Char_string obj = new Char_string();
		obj.stringmethods();
	}
}
