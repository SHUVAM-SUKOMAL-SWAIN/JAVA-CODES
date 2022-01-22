package Miscellaneous_Programs;
import java.util.Scanner;

public class RemoveBlankSpaceInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		Remove obj=new Remove();
		String s1=obj.trim(str);
		System.out.println("New string after removal of blank space is:"+s1);
		sc.close();

	}
}

class Remove
{
	String trim(String str)
	{
		String s1="";
		
		for(int i=0;i<str.length();i++)
		{
			int j=str.charAt(i);
			if(j!=32)
				s1=s1+str.charAt(i);
			
				
		}
		
		return s1;		
	}
}
