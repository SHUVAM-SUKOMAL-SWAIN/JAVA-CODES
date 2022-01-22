package Miscellaneous_Programs;
import java.util.*;

public class SortArrayList {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		List <Integer> list=new ArrayList <Integer> (Arrays.asList(54,34,2,556,1,5678,43,78));
		Sorting obj=new Sorting();
		list=obj.check(list);
		
		sc.close();
		System.out.print("The ArrayList elements after sorting are: ");
		for(int a:list)
	    System.out.println(a);
	        

	}
}

class Sorting
{
	List<Integer> check(List <Integer> list)
	{
		Object temp;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if((Integer) list.get(i)>(Integer) list.get(j))
				{	
				temp=list.get(i);
				list.set(i,list.get(j));
				list.set(j,(Integer) temp);
				}
			}
		}
	
	return list;
	}
}