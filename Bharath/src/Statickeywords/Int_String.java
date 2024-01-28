package Statickeywords;

public class Int_String {
	int i=100;
	public void stringmethods()
	{
		String s=Integer.toString(i);
		System.out.println(s);
	}
	public static void main(String[]args)
	{
		Int_String obj = new Int_String();
		obj.stringmethods();
	}

}
