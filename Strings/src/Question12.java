/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 12

Description:

How can you compare two strings lexicographically in Java?
*/

public class Question12
{
	public static int customCompareTo(String s1,String s2)
	{
		if(s1==null || s2 == null)
		{
			System.out.println("Cannot compare references pointing to null.");
			return Integer.MIN_VALUE;
		}
		int diff = s1.length()-s2.length();
		int length;
		if(s1.length()>s2.length())
			length = s2.length();
		else
			length = s1.length();
		
		//Iterating the shorter String
		for(int i = 0;i<length;i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
				return (int)s1.charAt(i) - (int)s2.charAt(i);
		}
		return diff; 
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s1 = "Ab";
		String s2 = "abcdef";
		System.out.println("The string \""+s1+"\" compares with string s2 \""+s2+"\" is : "+s1.compareTo(s2));
		System.out.println("The string \""+s1+"\" compares with string s2 \""+s2+"\" is : "+customCompareTo(s1,s2));
	}
}