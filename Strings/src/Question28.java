/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 28

Description:

Write a Java program to remove duplicate characters from a string
and maintain the original order.
*/

public class Question28
{	
	public static String removeDuplicateCharacters(String s)
	{
		if(s==null || s.isEmpty() ||s.length()==1)
			return s;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i)) == i)
				sb.append(s.charAt(i));
		}
		return sb.toString();		
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Javaisafunlanguagetolearnandwritein";
		System.out.println("The string \""+s+"\" after removing the duplicate characters is :"+removeDuplicateCharacters(s));
	}
}