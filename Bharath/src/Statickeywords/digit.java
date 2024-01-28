package Statickeywords;

public class digit {
	char i='1';
	public void stringmethods()
	{
		boolean b=Character.isDigit(i);
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		digit obj = new digit();
		obj.stringmethods();
	}

}
