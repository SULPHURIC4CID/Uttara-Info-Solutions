/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 13

Description:

Write a program to convert a string to lowercase.
*/

public class Question13
{
	public static String customToLowerCase(String s)
	{
		if(s==null || s.isEmpty())
			return s;
		StringBuilder sb = new StringBuilder();
		int charValue;
		for(int i =0;i<s.length();i++)
		{
			charValue = (int)s.charAt(i);
			if(charValue>=65 && charValue<=90)
				charValue+=32;
			sb.append((char)charValue);
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "AnanTHA";
		System.out.println("The string \""+s+"\" converted to lower case is : "+s.toLowerCase());
		System.out.println("The string \""+s+"\" converted to lower case is : "+customToLowerCase(s));
		
		
	}
}