package Miscellaneous_Programs;
import java.util.Scanner;

public class SortIntegerArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter total number of elements: ");
		int size=sc.nextInt();
		int array[]=new int[size];
	     System.out.print("Enter elements to the array: ");
	     for(int i=0;i<size;i++)
	     {
	    	 array[i]=sc.nextInt();
	     }
	     Calculate obj=new Calculate();
	     int array1[]=new int[size];
	     array1=obj.check(array);
	     
	     System.out.println("The array after sorting is: ");
	     for(int i=0;i<size;i++)
	    	 System.out.print(" "+array1[i]);
		sc.close();

	}
}

class Calculate
{
	int[] check(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		return array;
	}
}
