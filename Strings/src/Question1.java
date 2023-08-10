/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 1

Description:

Write a Java program to reverse a given string.
*/

public class Question1
{
	public static String reverseString(String s)
	{
		if(s.isEmpty())
			return s;
		if(s.length() == 1)
			return s;
		
		//Method 1 - Using String Builder
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		return sb.toString();
		*/
		
		//Method 2 - Using char Array
		
		char[] ca = s.toCharArray();
		for(int i = 0;i<ca.length/2;i++)
		{
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[ca.length-i-1] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
		}
		return new String(ca);
	}
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Anantha";
		System.out.println(reverseString(s));
		
	}
}