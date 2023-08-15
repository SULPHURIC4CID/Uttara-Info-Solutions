/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 22

Description:

Create a program that converts a sentence to "Pig Latin" (move
the first letter of each word to the end and add "ay").
*/

public class Question22
{
	public static String convertToPigLatin(String s)
	{
		//Failure case
		if(s==null || s.isEmpty())
			return s;
		
		//Preprocessing string s
		s = s.trim();
		
		StringBuilder sb = new StringBuilder();
		char ch = s.charAt(0);
		for(int i = 1;i<s.length();i++)
		{
			if(s.charAt(i) == ' ') // If space append first letter followed by "ay", and reinitialise 'ch'
			{
				sb.append(ch);
				sb.append("ay");
				sb.append(' ');
				ch = s.charAt(i+1);
				i++;
			}
			else //If not space keeping appending character
				sb.append(s.charAt(i));
		}		
		sb.append(ch);
		sb.append("ay");
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Java is fun";				
		System.out.println("The String \""+s+"\" converted to Pig Latin is : "+convertToPigLatin(s));		
	}
}