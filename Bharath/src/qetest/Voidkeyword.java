package qetest;

public class Voidkeyword {
	int a;
    int b;
   public void add(int x,int y)
   {
	   System.out.println(x+y);
   }
   public int sub(int x, int y)
   {
	   int z=x-y;
	   return z ;
   }
   public static void main(String[] args)
   {
	   Voidkeyword obj =new Voidkeyword();
	   obj.add(20,20);
	   int a=obj.sub(30,20);
	   System.out.println(a);
   }

}
