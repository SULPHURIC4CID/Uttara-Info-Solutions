/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 18

Description:

Write a function to check if a given string is an anagram of another
string.
*/

public class Question18
{
	public static boolean checkIfAnagram(String s1, String s2)
	{
		if(s1==null || s2==null)
			return false;
		if(s1.isEmpty() && s2.isEmpty())
			return true;
		if(s1.length()!=s2.length())
			return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int[] arr = new int[26];
		int[] arr1 = new int[26];
		for(int i = 0;i<s1.length();i++)
		{
			arr[(int)s1.charAt(i)-97]++;
			arr1[(int)s2.charAt(i)-97]++;
		}
		for(int i =0;i<26;i++)
			if(arr[i]!=arr1[i])
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s1 = "bAT";
		String s2 = "tab";
		String result = checkIfAnagram(s1,s2)?"The strings \""+s1+"\" and \""+s2+"\" are anagrams.":"The strings \""+s1+"\" and \""+s2+"\" are not anagrams.";
		System.out.println(result);
	}
}