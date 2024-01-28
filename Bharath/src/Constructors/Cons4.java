package Constructors;

public class Cons4 {

// parameterized constructor
	public Cons4(int a,int b)
	{
		System.out.println(a+b);
	}
	public void method()
	{
		System.out.println(" this is methos");
	}
	public static void main (String[]args)
	{
		Cons4 obj=new Cons4(10,20);
		obj.method();
	}

}
