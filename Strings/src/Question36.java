/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 36

Description:

Write a Java program to find the longest substring without any
repeating characters.
*/

public class Question36
{	
	public static boolean checkDistinct(String s)
	{
		for(int i = 0;i<s.length();i++)
			if(s.indexOf(s.charAt(i)) != i)
				return false;
		return true;
	}

	public static String longestSubstringNoRepeat(String s)
	{
		if(s==null || s.isEmpty() || s.length()==1)
			return s;
		
		int length = Integer.MIN_VALUE;
		String result="";
		String temp="";
		for(int i = 0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				temp = s.substring(i,j);
				if(checkDistinct(temp) && temp.length()>length)
				{
					length =  temp.length();
					result = temp;
				}				
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java is a fun language to learn and write";
		System.out.println("The longest substring of the string \""+s+"\" without repeated characters is :"+longestSubstringNoRepeat(s));
	}
}