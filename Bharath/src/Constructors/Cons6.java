package Constructors;

public class Cons6 {
	// constructor chaining 
	
	public Cons6(int a)
	{
		System.out.println(a);
	}
	
	public Cons6(double a)
	{
		System.out.println(a);
	}
	public Cons6(int a,int b)
	{
		System.out.println(a+b);
	}
	public Cons6(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void method()
	{
		System.out.println("this is method");
	}
	public static void main(String[]args)
	{
	Cons6 obj= new Cons6(30);
	Cons6 obj2=new Cons6(10,20);
	Cons6 Obj3= new Cons6(10,20,30);
	obj.method();
	}

}
