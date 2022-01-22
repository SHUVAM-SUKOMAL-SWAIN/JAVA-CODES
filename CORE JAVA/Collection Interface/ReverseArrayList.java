package Miscellaneous_Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		List <Integer> list=new ArrayList <Integer> (Arrays.asList(54,34,2,556,1,5678,43,78));
		System.out.print("The ArrayList elements are: ");
		for(int a:list)
	    System.out.print(a+" ");
		
		list=reverseArrayList(list);
		sc.close();
		System.out.println();
		System.out.print("The ArrayList elements after reversing are: ");
		for(int a:list)
	    System.out.print(a+" ");
	}
	static List <Integer> reverseArrayList(List<Integer> list)
	{
		int i,j;
		Object temp;
		for(i=0,j=list.size()-1;i<=(list.size()/2);i++,j--)
		{
				
			temp=list.get(i);
			list.set(i,list.get(j));
			list.set(j,(Integer) temp);
			
		}
		return list;
	}
}



