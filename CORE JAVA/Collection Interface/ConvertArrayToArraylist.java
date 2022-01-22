package Miscellaneous_Programs;
import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToArraylist 
{
	public static void main(String[] args) 
	{
		List <String> list=new ArrayList <String> ();
		list.add("shuvam");
		list.add("rom");
		list.add("john");
		list.add("kit");
		list.add("hello");
		
		System.out.println(list);
		String array[]=new String [list.size()];
		list.toArray(array);
		for(String str:array)
			System.out.print(str+" ");
		

	}

}
