package Miscellaneous_Programs;
import java.util.*;
public class ConvertArrayListToStringArray {

	public static void main(String[] args) 
	{

		List <String> list=new ArrayList <String> ();
		list.add("shuvam");
		list.add("boy");
		list.add("good");
		list.add("joei");
		list.add("hello");
		
		//String a[]=list.toArray(new String[list.size()]);
		String a[]=new String[list.size()];
	     list.toArray(a );
		for(String str:a)
		{
		System.out.println(str);
		}
		
         //not working in case of integer
	}

}
