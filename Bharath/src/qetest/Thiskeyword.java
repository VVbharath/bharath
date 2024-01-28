package qetest;

public class Thiskeyword {
	
	int a;
	int b ;
  public void add(int a,int b)
  {
	  this.a =a;
	  this.b =b;
	  System.out.println(this.a+this.b);
	  this.mutl(2,2);
  }
public void mutl(int a , int b)
{
	this.a=a;
	this.b=b;
	System.out.println(this.a*this.b);
}
public static void main(String[] args)
{
Thiskeyword obj = new Thiskeyword();
obj.add(20,20);
}
}
