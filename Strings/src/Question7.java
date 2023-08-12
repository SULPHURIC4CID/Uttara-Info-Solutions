/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 7

Description:

Write a function to check if a string is a palindrome.
*/

public class Question7
{
	public static boolean checkIfPalindrome(String s)
	{
		if(s==null)
			return false;
		if(s.isEmpty())
			return false;			
		if(s.length()==1)
			return true;
		
		//Method 1 - using StringBuilder
		/*
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		if(s.equals(s1))
			return true;
		else
			return false;
		*/

		//Method 2 - using char Array
		
		char[] ca = s.toCharArray();
		for(int i = 0;i<ca.length;i++)
			if(ca[i] != ca[ca.length-i-1])
				return false;
		return true;		
		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "ABCDCBA";
		String result = checkIfPalindrome(s)?"The string "+s+" is a palindrome.":"The string "+s+" is not a palindrome.";
		System.out.println(result);
	}
}