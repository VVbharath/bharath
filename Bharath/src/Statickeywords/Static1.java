package Statickeywords;

public class Static1 {
  int a= 10;
  static int b =20;
  public void nonStatic_menthod()
  {
	  System.out.println("non static method");
  }
  public static void static_method()
  {
	  System.out.println("static method");
  }
  public static void main(String[] args)
  {
	  Static1 obj =new Static1();
	  obj.nonStatic_menthod();
	  System.out.println(obj.a);
	  Static1.static_method();
	  System.out.println(Static1.b);
  }
  
}
