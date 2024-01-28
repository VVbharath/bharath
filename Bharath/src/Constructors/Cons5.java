package Constructors;

public class Cons5 {
	//constructor overloading
	public Cons5(int a)
	{
		System.out.println(a);
	}
	
	public Cons5(double a)
	{
		System.out.println(a);
	}
	public Cons5(int a,int b)
	{
		System.out.println(a+b);
	}
	public Cons5(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void method()
	{
		System.out.println("this is method");
	}
	public static void main(String[]args)
	{
	Cons5 obj= new Cons5(10,20,10);
	obj.method();
	}
	
	
}

