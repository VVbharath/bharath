package character;

import java.util.*;

public class Findchar{

	public static void mian(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  
		  String str;
		  System.out.println("Enter the s :");
		  str =sc.nextLine();
		  
		  char ch[] =str.toCharArray();
		  int letters=0;
		  for(int i=0;i<str.length();i++);
		  {
			  int a;
			if(Character.isLetter(ch[i]));
			  {
				  letters++;
			  }
	}
		  System.out.println("string "+str);
		  
	      
	}


