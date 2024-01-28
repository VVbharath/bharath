package character;
import java.util.Scanner;

public class Findchar1 
{
	public void character()  
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string :");
	String a=sc.nextLine();
	String b="";
	for(int i=0;i<=a.length()-1;i++)
	{
	char c=a.charAt(i);
	if(Character.isAlphabetic(c))
	  {
		b=b+c;
	  }
	}
	System.out.println(b);
	int cg=b.length();
	System.out.print(cg);
    }
public static void main(String[]args)
    {
    Findchar1 obj=new Findchar1();
    obj.character();
    }
}
