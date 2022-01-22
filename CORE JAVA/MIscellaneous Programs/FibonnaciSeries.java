package Miscellaneous_Programs;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{
	int array[]=new int[100];
	int a=0,b=1;
	for(int i=2;i<100;i++)
	{
		array[i]=a+b;
		a=b;
		b=array[i];	
	}
	System.out.println("The Fibonnaci series is: "+"0 "+"1 ");
    for(int z:array)
	System.out.print(z+" ");
	}

}
