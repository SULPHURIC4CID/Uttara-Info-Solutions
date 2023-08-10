/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 5

Description:

Write a program to count the number of vowels in a string.
*/

public class Question5
{
	public static int countVowels(String s)
	{
		s = s.toLowerCase();
		int countVowels = 0;
		for(int i = 0;i<s.length();i++)
			switch(s.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					countVowels++;
					break;
				default:
					break;
			}
		return countVowels;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "Anantha";
		System.out.println("The number of vowels in the string "+s+" is : "+countVowels(s));
		
		
	}
}