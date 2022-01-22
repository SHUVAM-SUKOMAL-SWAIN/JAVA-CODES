package Miscellaneous_Programs;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		Operation obj=new Operation();
		int num2=obj.convert(num);
		System.out.println("The armstrong number is:"+num2);
		sc.close();

	}

}

class Operation
{
	/*int convert(int num)
	{
		int num2=num,digit=0;//error when writhing only int digit;
		int num3=num;
		int sum=0;
		int dg,count;
		while(num2!=0)
		{
			digit ++;
			num2=num2/10;
		}
		while(num3!=0)
		{
			 dg=num3 %10;
			 count=1;
			for(int j=1;j<=digit;j++)
			{
				count=count*dg;
			}
			sum=sum+count;
			num3=num3/10;
		}
		return sum;*/
		int convert(int num)
		{
		int num1=num,i=0,sum=0,mult;
		int array[]=new int[10];
		while(num1!=0)
		{
			array[i]=num1%10;
			i++;
			num1=num1/10;
		}
		for(int j=0;j<i;j++)
		{
			mult=1;
		for(int k=0;k<i;k++)
		{
			mult=mult*array[k];
		}
		sum=sum+mult;
		}
		return sum;
		}
	}

