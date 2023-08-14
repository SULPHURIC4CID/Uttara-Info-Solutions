/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 20

Description:

Write a Java program to find and print all the unique characters in
a string.
*/

public class Question20
{
	public static void printUniqueCharacters(String s)
	{
		//Failure Case
		if(s==null || s.isEmpty())
			return;
		
		//Main Logic
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i)) == i)
				sb.append(s.charAt(i));
		}
		
		//Dispalying the unique characters
		for(int i=0;i<sb.length();i++)
		{
			System.out.print(sb.charAt(i)+" ");
		}		
		System.out.println();		
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "aaaaaacccceefggfeeaaaafa";
		System.out.println("The original String is   : "+s);
		System.out.println("The unique characters in the String \""+s+"\" are : ");
		printUniqueCharacters(s);
	}
}