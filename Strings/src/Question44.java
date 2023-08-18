/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 44

Description:

Create a function to calculate the edit distance between two
strings (Levenshtein distance).

Used the formula from Wikipedia

https://en.wikipedia.org/wiki/Levenshtein_distance

*/

public class Question44
{	
	public static int min(int a,int b, int c)
	{
		if(a<=b && a<=c)
			return a;
		else if (b<=a && b<=c)
			return b;
		else
			return c;
	}
	
	public static int findLevenshteinDistance(String s1,String s2)
	{
		int val1,val2,val3;
		//Single case
		if(s1==null && s2==null)
			return 0;
		if((s1 == null || s1.isEmpty()) && s2 != null)
			return s2.length();
		if((s2 == null || s2.isEmpty()) && s1 != null)
			return s1.length();
		if(s1.charAt(0) == s2.charAt(0))
			return findLevenshteinDistance(s1.substring(1),s2.substring(1));
		else
		{
			val1 = findLevenshteinDistance(s1.substring(1),s2);
			val2 = findLevenshteinDistance(s1,s2.substring(1));
			val3 = findLevenshteinDistance(s1.substring(1),s2.substring(1));
			return 1+min(val1,val2,val3);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s1 = "buttermilk";
		String s2 = "yoghurt";
		System.out.println("The Levenshtein distance between the strings \""+s1+"\" and \""+s2+"\" is :"+findLevenshteinDistance(s1,s2));
		
	}
}