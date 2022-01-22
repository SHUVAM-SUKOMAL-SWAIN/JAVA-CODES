package Miscellaneous_Programs;
import java.util.*;
public class ConvertCaseOfAlphabate {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		 
		Operate obj=new Operate();
		String str1=obj.convert(str);
		
		System.out.println("The converted string is: "+str1);
				
		sc.close();

	}

}

class Operate
{
	String convert(String str)
	{
		int a,b=32,c;
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			a=0;
			if(c!=b)
			{
				if(c>=97 && c<=122)
				{
				c=c-97;
				a=65+c;
				}
				
				else
				{
					c=c-65;
					a=97+c;
				}
				newstr=newstr+(char) a;
			}
			else
				newstr=newstr+(char) b;
		}
		return newstr;
	}
}