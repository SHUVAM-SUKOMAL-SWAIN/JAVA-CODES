package Miscellaneous_Programs;
import java.util.*;

public class CheckUniqueCharacterInString 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		ChkUnique obj=new ChkUnique();
		boolean b=obj.check(str);
		if(b)
		System.out.println("The string has all unique characters");
		
		else
			System.out.println("The string has repeated characters");
		sc.close();
	}

}

class ChkUnique
{
	boolean check(String str)
	{
	for(int i=0;i<str.length();++i)
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(str.charAt(i)==str.charAt(j))
				return false;
				
		}
	}
		return true;
	}
}


//METHOD 2//
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class uniquechar {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Alve i@wsom";
        System.out.println(inputstring);
        HashSet < Character> uniquecharset= new HashSet();
        for(int i=0;i < inputstring.length();i++)
        {
            result=uniquecharset.add(inputstring.charAt(i));
            if (result == false)
            break;
        }
    System.out.println(result); }
}*/


//METHOD 3//
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueChar3 {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Alive is awesome";
        System.out.println("String method 3 answer "+ method3(inputstring));
    }
    public static boolean method3(String input)
    {
        ArrayList ar= new ArrayList();
        for (int i=0; i < input.length() ; i++ )
        {
            int j = input.indexOf(input.charAt(i));
            ar.add(j);
        }
        Collections.sort(ar);
        for (int i=0;i < (ar.size()-1);i++)
        {
            if (ar.get(i) == ar.get(i+1))
            return false;
        }
        return true;
    }
}  
*/

//method 4//
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueChar4 {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Alive is awesome";
        System.out.println("String method 4 answer "+ method4(inputstring));
    }
    
    public static boolean method4(String input)
    {
        boolean result=false;
        for (char ch: input.toCharArray())
        {
            if(input.indexOf(ch)== input.lastIndexOf(ch))
            result= true;
            else
            {
                result=false;
                break;
            }
        }
        return result;
    }
}
*/