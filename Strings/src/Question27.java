/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 27

Description:

Implement a program to count the number of palindrome
substrings within a given string.
*/

public class Question27
{	
	public static int countPalindromicSubstrings(String s)
	{
		//Failure case
		if(s==null || s.isEmpty())
			return 0;
		//Single case
		if(s.length()==1)
			return 1;
		
		//Main logic
		//Extract all substrings and check if they are palindrome
		int count = 0;
		String temp;
		for(int i = 0;i<s.length();i++)
		{
			for(int j =i;j<s.length();j++)
			{
				temp = s.substring(i,j);
				if(Question7.checkIfPalindrome(temp))
					count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "Javaisafunlanguagetolearnandwritein";
		System.out.println("The number of palindromic substrings in \""+s+"\" is :"+countPalindromicSubstrings(s));
	}
}