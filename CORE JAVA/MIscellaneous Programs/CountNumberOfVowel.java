package Miscellaneous_Programs;
import java.util.Scanner;

public class CountNumberOfVowel {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		
		Open obj=new Open();
		int num=obj.count(str);
		System.out.print("The no of vowels present in the string are: "+num);	
		sc.close();
	}
}

class Open
{
	int count(String str)
	{
		int counter=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c==' ')
				continue;
			
			if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
				counter++;
		}
		return counter;
	}
}
