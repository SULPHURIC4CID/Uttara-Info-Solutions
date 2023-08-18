/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 39

Description:

Write a Java program to find the longest common subsequence
between two strings.
*/

public class Question39
{	
	public static String longestCommonSubsequence(String s,String t)
	{
		//Failure Case
		if(s==null || s.isEmpty())
			return s;
		if(t==null || t.isEmpty())
			return t;
		
		//Find smallest of the two strings and the diff value
		String temp = "";
		String temp2 = "";
		int length = 0;
		if(s.length()>t.length())
		{
			temp = t;
			temp2 = s;
			length = t.length();			
		}
		else
		{
			temp = s;
			temp2 = t;
			length = s.length();			
		}
		
		int maxLength = Integer.MIN_VALUE;
		String result = "";
		//Get all substrings of the smaller strings
		for(int i = 0;i<length;i++)
		{
			for(int j =i+1;j<length+1;j++)
			{
				if(temp2.contains(temp.substring(i,j)))
				{
					if(maxLength<(j-i+1))
					{
						maxLength = (j-i+1);
						result = temp.substring(i,j);
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String t = "aabbcc";
		String s = "aabbccaabbccaabbccaabbcc";
		System.out.println("The longest common substring between \""+s+"\" and \""+t+"\" is : "+longestCommonSubsequence(s,t));
		
	}
}