package Miscellaneous_Programs;
import java.util.*;
public class CheckStringPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		IsPalindrome obj=new IsPalindrome();
		boolean b=obj.check(str);
				if(b)
					System.out.println("The string is palindrome");
				else
					System.out.println("The string is not palindrome");
		sc.close();

	}

}

class IsPalindrome
{
	boolean check(String str)
	{
		for(int i=0,j=str.length()-1;i<=(str.length()/2);i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return true;
	}
}