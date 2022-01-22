package Miscellaneous_Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IterateArrayList {

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		List <Integer> list=new ArrayList <Integer> (Arrays.asList(54,34,2,556,1,5678,43,78));
		System.out.println(list);
		
		Iterator <Integer> itr= list.iterator();
		System.out.print("The arraylist elements are: ");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		sc.close();

	}

}
