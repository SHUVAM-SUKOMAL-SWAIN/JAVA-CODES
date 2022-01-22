package Miscellaneous_Programs;
import java.util.Scanner;

public class CheckPalindrome{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		System.out.println(str.length()/2);
		boolean b=check(str);
		
		if(b)
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not pallindrome");
		sc.close();

	}

	 static boolean check(String str) //why error when removing static//
	{
		 int i,j;
	for(i=0,j=str.length()-1;i<-str.length()/2;i++,j--)	
	{
		if(str.charAt(i)!=str.charAt(j))
			return false;
	}
	return true;
	}
}
