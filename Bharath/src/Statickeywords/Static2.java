package Statickeywords;

public class Static2 {
	  
	
	int a= 10;
	  int b= 20;
	  static int c ;
	  public void nonStatic_menthod()
	  {
		  c=a+b;
		  System.out.println(c);
		  static_method();
	  }
	  public static void static_method()
	  {
		  c=a+b;//error : static method does not allow non static fields
		  System.out.println(c);
		  nonStatic_menthod();//error :static method does not allow non static methods
	  }
	  public static void main(String[] args)
	  {
		  Static2 obj =new Static2();
		  obj.nonStatic_menthod();
		  System.out.println(obj.a);
		  Static2.static_method();
		  System.out.println(Static1.b);
	  }
	  

}
