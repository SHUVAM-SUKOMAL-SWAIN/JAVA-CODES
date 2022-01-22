package Miscellaneous_Programs;

import java.util.*;
public class IntersectionOfTwoArrays {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of first array");
		int size1=sc.nextInt();
		System.out.print("Enter the size of second array");
		int size2=sc.nextInt();
		Operation1 obj=new Operation1();
		
		System.out.println("Enter first array elements");
		int array1[]=obj.addElements(size1);
		
		System.out.println("Enter second array5 elements");
		int array2[]=obj.addElements(size2);
		
		int array3[]=obj.checkUnique(array1, array2);
		System.out.print("The intersection of the two array are: ");
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+",");
		}
		
        sc.close();
	}

}

class Operation1
{
	Scanner sc=new Scanner(System.in);
	
	int[] addElements(int size)
	{
		int array[]= new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		return array;
	}
	
	int[] checkUnique(int array1[],int array2[])
	{
		int store[]=new int[array1.length];
	    int i,j,k=0;
		for(i=0;i<array1.length;i++)
		{
			
			for(j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
				store[k]=array1[i];
				k++;
				break;
				}
			}
			
		}
		
		return store;
	}
}