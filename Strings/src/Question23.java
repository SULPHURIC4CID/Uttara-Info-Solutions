/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 23

Description:

Write a function to find the first non-repeated character in a string.
*/

public class Question23
{
	public static void findFirstNonrepeatedCharacter(String s)
	{
		//Failure case
		if(s==null || s.isEmpty())
		{
			System.out.println("Bad String");
			return;
		}
		
		//Main Logic - If first and last index are same then its unique
		for(int i = 0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
			{
				System.out.println("The first non repeated character in the string \""+s+"\" is : "+s.charAt(i)); 
				return;
			}
		}	
		System.out.println("The string \""+s+"\" does not contain distinct characters."); 		
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java is fun is Java";				
		findFirstNonrepeatedCharacter(s);		
	}
}