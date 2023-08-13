/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 11

Description:

Write a function to remove all spaces from a string.
*/

public class Question11
{
	public static String removeSpaces(String s)
	{
		if (s==null || s.isEmpty())
			return s;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
				sb.append(s.charAt(i));
				
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Java is fun to learn.";
		System.out.println("The space removed string is : "+removeSpaces(s));		
	}
}