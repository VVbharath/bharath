package qetest;

public class methods { 
 int a=20;// global variables 
 int b=20;
 int c;
		 public void sub()
		 {
	     c=a-b;
		 System.out.println(c);
		 }
	     public void additions()
	     {
		 c=a+b;
		 System.out.println(c);
	     }
	     public void muit()
	     {
		 c=a+b;
		 System.out.println(c);
	     }
	     public void div()
	     {
	     c=a/b;
	     System.out.println(c);
	    // System.out.println(a ==b);
	     }
	     public static void main(String[] args)
	     {
	 	 methods obj= new methods();
	 	 obj.additions();
	 	 obj.muit();
	 	 obj.sub();
	 	 obj.div();
	     }  
	     
}
 

