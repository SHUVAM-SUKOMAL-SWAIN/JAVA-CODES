package Miscellaneous_Programs;
import java.util.*;
public class ConvertSignedIntegerToString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int num=sc.nextInt();
		
		Convert obj=new Convert();
		String str=obj.check(num);
		System.out.print("The integer value in string is: "+str);
		sc.close();

	}

}
class Convert
{
	String check(int num)
	{
		String str;
		String str1=Integer.toString(num);
			str="";
		
		for(int i=0;i<str1.length();i++)
		{
			str=str+str1.charAt(i);
		}
		return str;
	
	}
}
