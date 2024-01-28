package Accessmodifers2;

public class Cons{

public Cons(int a,int b)


	{
		System.out.println("a+b");
	}
public void add()
{
	System.out.println("this a method");
}
	public  static void main(String[] args)
	{
	Cons obj =new Cons(100,20);
	obj.add();
	
	}

}
