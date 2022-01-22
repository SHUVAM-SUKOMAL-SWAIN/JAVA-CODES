package Miscellaneous_Programs;
import java.util.Scanner;
//if a string contains the same character and also with same number of character then the two strings are anagram
public class CheckAnagramString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.next();
		System.out.println("Enter the second string");
		String str2=sc.next();
		 
		ChkAnag obj=new ChkAnag();
		boolean b=obj.check(str1,str2);
		if(b)
			System.out.println("The two strings are Anagram");
		else
			System.out.println("The two strings are not Anagram");
		sc.close();

	}

}

class ChkAnag
{
	boolean check(String str1,String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		int a=0,b=0;
		for(int i=0;i<str1.length();i++)
		{
			a=a+str1.charAt(i);
			b=b+str2.charAt(i);
		}
		if(a==b)
			return true;
			else
				return false;
	}
}