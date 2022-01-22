package Miscellaneous_Programs;
import java.util.ArrayList;
import java.util.List;

public class ConvertIntegerArraylistToArray 
{
	public static void main(String[] args) 
	{
		List <Integer> list=new ArrayList <Integer> ();
		list.add(10);
		list.add(69);
		list.add(56);
		list.add(87);
		list.add(98);
		
		
		System.out.println(list);
		Object[] array=new Object [list.size()];
		array=list.toArray();
		
		for(Object a:array)
			System.out.print(a+" ");

	}

}


