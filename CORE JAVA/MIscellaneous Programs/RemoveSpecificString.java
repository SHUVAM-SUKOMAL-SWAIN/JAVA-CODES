package Miscellaneous_Programs;
import java.util.Scanner;

public class RemoveSpecificString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		System.out.println("Enter a string to be removed:");
		String str1=sc.next();
		
		Trim obj=new Trim();
		String str2=obj.check(str,str1);
		System.out.println("The new string after trimming is: "+str2);
	
		sc.close();

	}

}

class Trim
{
	String check(String str,String str1)
	{
		String str2="";
		int c;
		for(int i=0;i<str.length();i++)
		{
			c=0;
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i)!=str1.charAt(j))
		             c++;
			}
			 if(c==str1.length())
           str2=str2+(char) str.charAt(i);
		}
		return str2;
	
	/*String check(String str,String str1)
	{
		int c;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
					charRemoveAt(str,i);
			}
		}
	}*/
}
}

				
			


