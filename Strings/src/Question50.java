/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 50

Description:

Write a function to find the longest substring with equal number of
0s and 1s.
*/

public class Question50
{
	public static boolean check(String s)
	{
		int count0 = 0;
		int count1 = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == '0')
				count0++;
			else
				count1++;
		}
		if(count0==count1)
			return true;
		else
			return false;		
	}
	
	public static String findLongestSubstringWithEqual0And1(String s)
	{
		//Failure Case
		if(s==null || s.trim().isEmpty())
			return s;
		s = s.trim();
		//Checking if non 0,1 characters are present
		for(int i = 0;i<s.length();i++)
			if(s.charAt(i) != '0' && s.charAt(i) != '1')
				return "String contains characters apart from 0 and 1";
	
		//Main Logic - Get all substrings, and find max with eqaul 0s and 1s
		String[] substrings = Question47.getSubstrings(s);
		int length = Integer.MIN_VALUE;
		String result = "";
		for(int i = 0;i<substrings.length;i++)
			if(substrings[i].length()>length && check(substrings[i]))
			{
				length  = substrings[i].length();
				result = substrings[i];
			}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "111111111110101000101010101000000101010100101011111111000000";
		System.out.println("The original string is : "+s);		
		String result = findLongestSubstringWithEqual0And1(s);
		System.out.println("The longest substring with equal 0s and 1s is :"+result);
		int count0 = 0;
		int count1 = 0;
		for(int i = 0;i<result.length();i++)
			if(result.charAt(i) == '0')
				count0++;
			else
				count1++;
		System.out.println("Number of 0s : "+count0+", number of 1s : "+count1);
	}
}