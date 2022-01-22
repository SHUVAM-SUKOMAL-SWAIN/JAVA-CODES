package Miscellaneous_Programs;

import java.util.*;
public class FirstNonRepeatedCharacter 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String str=sc.nextLine();
	
	ChkString obj=new ChkString();
	char char1=obj.check(str);
	
	if(char1==' ')
	System.out.println("All character are repeated");
	
	else
		System.out.println("The first non repeated character is:"+char1);
	sc.close();
}
}

class ChkString
{
	char check(String str)
	{
		int c,i,j;
		//error coming when input is (space)abcac
		for(i=0;i<str.length();++i)
		{
			c=0;
			for(j=0;j<str.length();j++)
			{
			if(str.charAt(i)==str.charAt(j))
				c++;
			
			}
			if(c==1)
			return str.charAt(i);
		}
		return ' ';
	}
}



//type2//
/*

    char check(String str)
    {
        List<Character> list = new ArrayList<>();
        for(int i=0; i < str.length(); i++) 
        {
            char c1 = str.charAt(i);
            
            if(list.contains(c1))
                list.remove((Character) c1);
                
             else
                list.add(c1);
                 }
        } 
        return list.get(0);
    }

   //METHOD 3//
  GIAS
 char check(String str)
 {
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	        char[] chArray = str.toCharArray();
	        for (char c : chArray)
	        {
	            if(map.containsKey(c))
	            {
	                map.put(c, (map.get(c))+1);
	            }
	            else
	            {
	                map.put(c, 1);
	            }
	        }
	        System.out.println(map);
	    }
	     
	}
 }
    */