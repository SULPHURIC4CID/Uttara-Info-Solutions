/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 41

Description:

Create a program that converts a sentence to its acronym (e.g.,
"Portable Network Graphics" becomes "PNG").
*/

public class Question41
{	
	public static String convertToAcronym(String s)
	{
		if(s==null || s.trim().isEmpty())
			return s;
		s = s.trim().toUpperCase();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<s.length();i++)
		{
			if(i==0 || s.charAt(i-1)==' ')
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java is the best programming language to learn.";
		String result = convertToAcronym(s);
		System.out.println("The acrpnym of the sentence \""+s+"\" is : "+result);
	}
}