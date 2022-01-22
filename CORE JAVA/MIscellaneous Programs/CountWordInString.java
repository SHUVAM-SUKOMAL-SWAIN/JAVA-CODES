package Miscellaneous_Programs;
import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		Count1 obj=new Count1();
		int num=obj.check(str);
		System.out.println("The number of words in the string are: "+num);
		sc.close();

	}

}

class Count1
{
	int check(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			int a=str.charAt(i);
		if(a==32)
			{c++;}
		}
		/*if(str.charAt(0)==' ' && str.charAt(str.length()-1)==' ')
			return c-1;
		else if(str.charAt(0)==' ' || str.charAt(str.length()-1)==' ')
			return c;
		else*/
			return c+1;
					
			
	}
}

