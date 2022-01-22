package Miscellaneous_Programs;

import java.util.*;
public class CountAlphabate{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	Count2 obj=new Count2();
	int result=obj.check(str);
	System.out.println("The total number of alphabates are:"+result);
	sc.close();

	}

}
class Count2
{
	int check(String str)
	{
		int a=str.length();
		int c=0;
		for(int i=0;i<a;i++)
		{
			
		
			int b=str.charAt(i);
			if(b==32)
				c++;
		}
	
	return (a-c);
	}
}