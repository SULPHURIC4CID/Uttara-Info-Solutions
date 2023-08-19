/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 48

Description:

Write a function to find the longest substring with at most K distinct
characters.
*/

public class Question48
{
	public static boolean checkDistinctCharacters(String s,int k)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
			if(sb.indexOf(s.substring(i,i+1))<0)
				sb.append(s.charAt(i));
		if(sb.length()<=k)
			return true;
		else
			return false;
	}
	
	public static String getSubstringsWithDistinctCharacters(String s,int k)
	{
		String[] arr = Question47.getSubstrings(s);
		int maxLength = Integer.MIN_VALUE;
		String result = "";
		for(int i = 0;i<arr.length;i++)
			if(checkDistinctCharacters(arr[i],k))
				if(arr[i].length()>maxLength)
				{
					maxLength = arr[i].length();
					result = arr[i];
				}
		return result;		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Java is a great language to learn.";
		int k = 5;
		
		System.out.println("The original string is : "+s);		
		String result = getSubstringsWithDistinctCharacters(s,k);
		System.out.println("The longest substring with at most "+k+" distinct characters is :"+result);
	}
}