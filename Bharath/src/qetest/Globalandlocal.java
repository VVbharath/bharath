package qetest;

public class Globalandlocal {

	int a = 30;//global variable 
	int b= 40;// global variable 
	
public void add()
{
int c= a+b;//local variable 
System.out.println(c);
}
public static void main(String[] args)
{
	Globalandlocal obj = new Globalandlocal();
	obj.add();
}
	
}
