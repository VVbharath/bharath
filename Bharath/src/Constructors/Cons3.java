package Constructors;

public class Cons3 {
	//user defined constructor
	public Cons3()
	{
		System.out.println("this is constructor");
	}
    public void method()
    {
    	System.out.println("this is method");
    }
    public static void main (String[]args)
    {
    	Cons3 obj = new Cons3();
    	obj.method();
 
    }
} 

