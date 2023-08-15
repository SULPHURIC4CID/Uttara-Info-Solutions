/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 26

Description:

Write a function to find the minimum window in a string which will
contain all the characters of another string.
*/

public class Question26
{	
	public static int findMinWindow(String s,String t)
	{
		//Failure Checks
		if(s==null || s.isEmpty())
			return 0;
		if(t==null||t.isEmpty())
			return 0;
		
		//Some temp variables
		int minLength = Integer.MAX_VALUE;
		String temp="";
		String temp2="";
		int count=0;
		
		//Iterating over all substrings to find the answer
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i;j<=s.length();j++)
			{
				if(j-i+1>minLength)
					continue;
				
				temp = s.substring(i,j);// Get the substring
				count=0;
				
				//Checking if all the characters of t are present in substring
				for(int k=0;k<t.length();k++)
				{
					if(temp.indexOf(t.charAt(k))>=0)
						count++;
				}
				
				if(count==t.length())
				{					
					if(temp.length()<minLength) //If all characters are present and length<minLength, swap
					{
						minLength=temp.length();
						temp2 = temp;
					}
				}
			}
		}
		//System.out.println(temp2);
		return minLength;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Javaisafunlanguagetolearnandwritein";
		String s1 = "avaw";
		System.out.println("The minimum window in \""+s+"\" that contains all the characters of another string \""+s1+"\" is of length :"+findMinWindow(s,s1));
	}
}