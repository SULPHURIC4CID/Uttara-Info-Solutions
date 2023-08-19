/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 46

Description:

Implement a function to find the longest palindromic substring in a
given string.
*/

public class Question46
{
	public static String expandAboutCenter(int i,String s)
	{	
		int left = 0;
		int right = 0;
		String temp = "";
		
		//For Odd length Palindrome
		while(true)
		{
			if((i-left)>=0 && (i+right) <= s.length()-1)
			{
				if(s.charAt(i-left) == s.charAt(i+right))
				{
					left++;
					right++;
				}
				else
				{
					temp = s.substring(i-left+1,i+right);
					break;
				}
			}	
			else		
			{
				temp = s.substring(i-left+1,i+right);
				break;
			}
		}
		
		left = 0;
		right = 0;
		String temp2 ="";
		//For Even length Palindrome
		while(true)
		{
			if((i-left)>=0 && (i+1+right) <= s.length()-1)
			{
				if(s.charAt(i-left) == s.charAt(i+1+right))
				{
					left++;
					right++;
				}
				else
				{
					temp2 = s.substring(i-left+1,i+1+right);
					break;
				}
			}	
			else		
			{
				temp2 = s.substring(i-left+1,i+1+right);
				break;
			}
		}
		if(temp2.length()>temp.length())
			return temp2;
		else	
			return temp;		
	}
	
	public static String findLongestPalindromicSubstring(String s)
	{
		
		//We will be expanding with each character as the center.
		// TC : O(n)
		// SC : is a bit high, but can be optimized
		
		int length;
		String temp;
		String result = "";
		for(int i = 0;i<s.length();i++)
		{
			temp = expandAboutCenter(i,s);
			if(temp.length()>result.length())
				result = temp;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "abbabbbcbabcbabcabcbacbababbaaaaaaaaaaaaaaaaaabbbabab";
		System.out.println("The longest palindromic Substring in the given String \""+s+"\" is :");
		System.out.println(findLongestPalindromicSubstring(s));
	}
}