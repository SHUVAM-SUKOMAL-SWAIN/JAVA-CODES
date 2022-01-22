package Miscellaneous_Programs;
import java.util.*;
public class CountCharacterInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		Count obj=new Count();
		int num=obj.check(str);
		System.out.println("The number of character in the string are: "+num);
		sc.close();
		
	}

}
class Count
{
	int check(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
		if(a!=32)
			c++;
		}
		return c;
	}
}
