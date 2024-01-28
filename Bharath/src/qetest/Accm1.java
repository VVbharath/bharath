package qetest;

public class Accm1 {
	public void public_method()
	{
		System.out.println("public method");		
	}
	public void private_method()
	{
		System.out.println("private method");
	}
	public void protected_method()
	{
		System.out.println("protected methos");
	}
	public void default_method()
	{
		System.out.println("default method");
	}
    public static void main(String[] args)
    {
    Accm1 obj= new Accm1();
    obj.public_method();
    obj.private_method();
    obj.protected_method();
    obj.default_method();
    }

}
