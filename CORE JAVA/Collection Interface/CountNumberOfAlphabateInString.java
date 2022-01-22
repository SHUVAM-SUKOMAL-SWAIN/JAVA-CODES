package Miscellaneous_Programs;

import java.util.*;
public class CountNumberOfAlphabateInString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		ChkString1 obj=new ChkString1();
		obj.check(str);
		sc.close();
	
	}
}

class ChkString1
{
void check(String str)
{
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	        char[] chArray = str.toCharArray();
	        for (char c : chArray)
	        {
	            if(map.containsKey(c))
	                map.put(c, (map.get(c))+1);
	        
	            else
	                map.put(c, 1);
	        }
	        System.out.println(map);
	    }
	     
	}