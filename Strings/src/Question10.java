/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 10

Description:

Create a Java program to find the index of a specific character in a
string.
*/

public class Question10
{
	public static int customIndexOf(String s,char ch)
	{
		if (s==null || s.isEmpty())
			return -1;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ch)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "anantha";
		char ch = 'a';		
		System.out.println("The index of the substring \""+ch+"\" in \""+s+"\" is : "+s.indexOf(ch));
		System.out.println("The index of the substring \""+ch+"\" in \""+s+"\" is : "+customIndexOf(s,ch));
	}
}