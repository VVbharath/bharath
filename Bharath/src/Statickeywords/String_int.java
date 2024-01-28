package Statickeywords;

public class String_int {
	String a1="300";
	public void stringMethods()
	{
		int i =Integer.parseInt(a1);
		System.out.println(i);
	}
  public static void main(String[]args)
  {
	  String_int obj=new String_int();
	  obj.stringMethods();
  }
}
