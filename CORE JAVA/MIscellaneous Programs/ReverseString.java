package Miscellaneous_Programs;
import java.util.*;
public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=sc.nextLine();
		
		RevStr obj=new RevStr();
		String strnew=obj.convert(str);
		
		System.out.println("The reverse of the string is:"+strnew);
		sc.close();
		

	}

}

class RevStr
{
String convert(String str)
{
	String str2="";
	for(int i=str.length()-1;i>=0;i--)
	{
		str2=str2+str.charAt(i);
	}
	return str2;
}
}